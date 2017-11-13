package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import app.java.bean.Product;
import app.java.service.ProductService;
import app.java.service.impl.ProductServiceImpl;
/**
 * 当前Servlet用于完成生成购物车功能.
 * @author JYL
 */
public class AddCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//1 获取指定添加购物车的商品ID.
		int id = Integer.parseInt(request.getParameter("id"));
		
		//2 通过商品ID查询数据库表,得到指定的商品信息.
		ProductService service = new ProductServiceImpl();
		Product product = service.findProductById(id);
		
		//购买商品的数量,默认为1.
		//4 创建或获取Session.
		HttpSession session = request.getSession();
		
		// 先从Session中获取到Map集合.(1)第一次购买,没有Map集合;2)第二次购买,具有Map集合)
		Map<Product, Integer> cart = (Map<Product, Integer>)session.getAttribute("cart");
		if(cart == null){
			// 第一次购买
			//5 构建一个Map集合(key存储商品信息,value存储商品数量),用于存储购物车的信息.
			cart = new HashMap<Product, Integer>();
			cart.put(product, 1);
			
			//6 将购物车信息,保存在Session中.
			session.setAttribute("cart", cart);
		}else{
			// 不是第一次购买:1)相同商品重复购买;2)不同商品的购买
			Set<Product> products = cart.keySet();
			Map<Integer,Product> ids = new HashMap<Integer,Product>();
			for (Product productEle : products) {
				int productId = productEle.getId();
				ids.put(productId, productEle);
				
			}
			
			if(ids.keySet().contains(id)){
				// 相同商品重复购买
				Product idProduct = ids.get(id);
				cart.put(idProduct, cart.get(idProduct)+1);
			}else{
				// 不同商品的购买
				cart.put(product, 1);
			}
			
		}
		
		//7 跳转页面
		request.getRequestDispatcher("/cart.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
