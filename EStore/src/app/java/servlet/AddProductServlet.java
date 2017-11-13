package app.java.servlet;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import app.java.bean.Product;
import app.java.service.ProductService;
import app.java.service.impl.ProductServiceImpl;
/**
 * 当前Servlet用于完成商品添加功能.
 * @author JYL
 *
 */
public class AddProductServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Product product = new Product();
			
			// 文件上传
			DiskFileItemFactory factory = new DiskFileItemFactory();
			
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			List<FileItem> items = upload.parseRequest(request);
			
			for (FileItem fileItem : items) {
				if(fileItem.isFormField()){
					// 是普通项
					String fieldname = fileItem.getFieldName();
					String fieldvalue = fileItem.getString("utf-8");
					// 通过表单元素名称判断,封装JavaBean
					if(fieldname.equals("name")){
						product.setName(fieldvalue);
					}else if(fieldname.equals("marketprice")){
						product.setMarketprice(Double.parseDouble(fieldvalue));
					}else if(fieldname.equals("estoreprice")){
						product.setEstoreprice(Double.parseDouble(fieldvalue));
					}else if(fieldname.equals("category")){
						product.setCategory(fieldvalue);
					}else if(fieldname.equals("pnum")){
						product.setPnum(Integer.parseInt(fieldvalue));
					}else if(fieldname.equals("description")){
						product.setDescription(fieldvalue);
					}
					
				}else{
					// 是文件项
					String filename = fileItem.getName();
					int index = filename.lastIndexOf("\\");
					if(index >= 0){
						filename = filename.substring(index+1, filename.length());
					}
					filename = UUID.randomUUID().toString()+"_"+filename;
					
					InputStream in = fileItem.getInputStream();
					
					String realpath = getServletContext().getRealPath("/uploads");
					OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(realpath,filename)));
					
					IOUtils.copy(in, out);
					
					in.close();
					out.close();
					
					String imgurl = "uploads\\"+filename;
					
					product.setImgurl(imgurl);
					
				}
			}
			
			// 表单的添加
			ProductService service = new ProductServiceImpl();
			boolean flag = service.addProduct(product);
			if(flag){
				// 添加成功
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
