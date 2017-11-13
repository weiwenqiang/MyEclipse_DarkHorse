package app.java.filter.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

public class UploadServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决文件项中文乱码问题
		request.setCharacterEncoding("utf-8");
		// Create a factory for disk-based file items
		// 1.创建文件上传的工厂事例对象
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// // Configure a repository (to ensure a secure temp location is used)
		// ServletContext servletContext =
		// this.getServletConfig().getServletContext();
		// File repository = (File)
		// servletContext.getAttribute("javax.servlet.context.tempdir");
		// factory.setRepository(repository);

		// Create a new file upload handler
		// 2.创建文件上传的ServletFileUpload事例对象
		ServletFileUpload upload = new ServletFileUpload(factory);

		final long startTime = System.currentTimeMillis();
		upload.setProgressListener(new ProgressListener() {
			/**
			 *  Updates the listeners status information
			 *  进度监听 
			 *  pBytesRead - The total number of bytes, which have been read so far.
    		 *	当前上传大小
    		 *	pContentLength - The total number of bytes, which are being read. May be -1, if this number is unknown.
    		 *	文件总大小
    		 *	pItems - The number of the field, which is currently being read. (0 = no item so far, 1 = first item is being read, ...)
			 * 	文件数
			 */
			@Override
			public void update(long pBytesRead, long pContentLength, int pItems) {
				//获取文件上传当前时间
				long currenTime = System.currentTimeMillis();
				//已用时间= 当前时间-开始时间
				long userTime = currenTime -startTime;
				//上传速度 = 已经上传大小 /已经用时
				long speed = pBytesRead / userTime;
				//剩余大小= 总大小-已经上传大小
				long restBytes = pContentLength - pBytesRead;
				//剩余时间 = 剩余大小/速度
				long restTime = restBytes /speed;
				
				System.out.println("已用时间:"+userTime +" 上传速度:"+speed+" 剩余大小："+restBytes+" 剩余时间"+restTime);
			}
		});
		
		
		// Parse the request
		// 3.利用ServletFileUpload事例对象解析request对象中有关文件上传的内容
		try {
			//限制单个文件上传大小
			upload.setFileSizeMax(1024*1024*300);
			//限制总大小
			upload.setSizeMax(1024*1024*1000);
			
			List<FileItem> items = upload.parseRequest(request);
			// 4.遍历文件上传的List集合，得到有关文件上传的所有内容（普通字段和上传文件内容）
			for (FileItem fileItem : items) {
				/**
				 * ?如何可以知道当前的FileItem是普通字段还是文件项 *
				 * 通过FileItem.isFormField()方法判断当前是普通项还是文件项 * 结果true 的话，表示普通 *
				 * 结果false的话，表示文件
				 */
				if (fileItem.isFormField()) {
					String fieldName = fileItem.getFieldName();
					//getString（编码）解决普通项！文件乱码
					String fieldValue = fileItem.getString("utf-8");
					System.out.println(fieldName + ":" + fieldValue);
				} else {
					String fileName = fileItem.getName();

					// 这里要解决浏览器过老的完整路径上传问题
					int index = fileName.lastIndexOf("\\");
					if (index >= 0) {
						fileName.substring(index + 1);
					}
					//为每个上传的文件名称，增加一个随机值
					fileName = UUID.randomUUID().toString()+fileName;
					System.out.println(fileName);

					InputStream in = fileItem.getInputStream();

					//将上传目录进行分级处理
					int hashcode = fileName.hashCode();
					//生成一级目录
					int d1 = hashcode & 0xf;
					//生成二级目录
					int d2 = (hashcode >>> 4) & 0xf;
					
					String realpath = getServletContext().getRealPath(
							"/uploads/"+d1+"/"+d2);
					new File(realpath).mkdirs();
					OutputStream out = new FileOutputStream(new File(realpath,fileName));

					IOUtils.copy(in, out);
					in.close();
					out.close();
				}
			}
		} catch (Exception e) {
			if(e instanceof FileSizeLimitExceededException){
				System.out.println("你上传的文件过大，请压缩后再上传");
			}
			if(e instanceof SizeLimitExceededException){
				System.out.println("你上传的文件总大小过大，请压缩后再上传");
			}
			e.printStackTrace();
		}
	}

}
