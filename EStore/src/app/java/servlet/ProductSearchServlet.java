package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.java.bean.Product;
import app.java.service.ProductService;
import app.java.service.impl.ProductServiceImpl;
/**
 * 当前Servlet用于完成指定商品的详细查询功能.
 * @author JYL
 */
public class ProductSearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//1 获取指定商品的ID
		int id = Integer.parseInt(request.getParameter("id"));
		
		//2 查询指定ID的商品详细信息
		ProductService service = new ProductServiceImpl();
		Product product = service.findProductById(id);
		
		request.setAttribute("product", product);
		request.getRequestDispatcher("/product_detail.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
