package app.java.upload;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns={"/upload"})
@MultipartConfig(
	location="\\WEB-INF\\tmp",		// 设置文件上传的临时目录
	fileSizeThreshold=1024*1024*3,	// 设置缓存大小
	maxFileSize=1024*1024*3,		// 设置上传单个文件大小
	maxRequestSize=1024*1024*10	// 设置上传总大小
)
public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 如何来处理文件的上传逻辑:Part接口
		request.setCharacterEncoding("utf-8");
		
		/*
		 * 1 如何获取文件上传的普通项?
		 *  * 通过Request对象的getParameter(String name)方法,可以或上传的普通项.
		 *    * name参数:指定客户端页面上传普通项的name属性值.
		 */
		String filetext = request.getParameter("filetext");
		
		/*
		 * 2 如何获取Part接口的实例对象?
		 *  * 通过Request对象的getPart(String name)方法,可以获取Part接口的实例对象.
		 *    * name参数:指定客户端页面上传文件域的name属性值.
		 *  * 通过Part接口的实例对象获取有关文件上传项的名称、文件输入流.
		 *  * Part接口提供的write(filename)方法:
		 *    * 将接收到的文件输入流,写入指定的服务器端的目录中.
		 *    * 参数filename:指定的保存文件的绝对路径.
		 *  * Part接口提供getName()方法:
		 *    * 获取的是上传文件域的name属性值.
		 *    * 并没有获取真实上传的文件名称.
		 *  * 上传的真实文件名称应该是如何获取到的呢?
		 *    * Servlet 3.0完成文件上传功能的诟病.
		 *    * 
		 */
		Part part = request.getPart("upload");
		/*String filename = part.getName();
		System.out.println(filename);*/
		
		/*
		 *  获取上传的真实文件名称:
		 *  Content-Disposition: form-data; name="upload"; filename="readme.txt"
		 */
		String header = part.getHeader("Content-Disposition");
		int index = header.lastIndexOf("filename=\"");
		String filename = header.substring(index+10, header.length()-1);
		
		InputStream in = part.getInputStream();
		String realPath = getServletContext().getRealPath("/WEB-INF/uploads");
		part.write(realPath+"/"+filename);
	}

}
