package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.java.bean.Product;
import app.java.service.ProductService;
import app.java.service.impl.ProductServiceImpl;
/**
 * 当前Servlet用于完成查询所有商品的功能.
 * @author JYL
 */
public class ProductListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductService service = new ProductServiceImpl();
		List<Product> products = service.findProduct();
		
		request.setAttribute("products", products);
		request.getRequestDispatcher("/product.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
