package app.java.down;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.io.IOUtils;

import sun.misc.BASE64Encoder;

import app.java.utils.JDBCUtils;
/**
 * 当前Servlet用于完成文件下载.
 * @author JYL
 */
public class DownServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("已经收到要下载的文件名称啦。。。。");
		
		//1 获取客户端请求下载的文件名称.
		String filename = request.getParameter("filename");
		
		// 解决GET方式请求的参数中文乱码问题:
		filename = new String(filename.getBytes("ISO-8859-1"),"utf-8");
		
		//2 通过文件名称,查询数据表.
		QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "SELECT * FROM filesave WHERE filename=?";
		try {
			FileSave filesave = runner.query(sql, new BeanHandler<FileSave>(FileSave.class), filename);
		
			//3 通过查询到的保存路径,读取具体文件.
			InputStream in = new FileInputStream(new File(filesave.getSavepath()));
			
			//4 获取服务器端的响应输出流
			OutputStream out = response.getOutputStream();
			
			// 获取客户端请求头中的User-Agent
			String userAgent = request.getHeader("User-Agent");
			if(userAgent.contains("MSIE")){
				// IE浏览器
				filename = URLEncoder.encode(filename, "utf-8");
				filename = filename.replace("+", " ");
			}else{
				// 其他浏览器
				BASE64Encoder base64Encoder = new BASE64Encoder();
				filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
			}
			
			/*
			 *  通知浏览器:文件是需要下载的,而不是显示的.
			 *  * 为下载设置ContentType和Content-Disposition
			 */
			response.setContentType(getServletContext().getMimeType(filename));
			response.setHeader("Content-Disposition", "attachment;filename="+filename);
			
			//5 利用IOUtils工具类的copy()方法
			IOUtils.copy(in, out);
			
			//6 释放资源
			in.close();
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
