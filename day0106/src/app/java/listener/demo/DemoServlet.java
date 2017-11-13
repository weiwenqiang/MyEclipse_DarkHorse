package app.java.listener.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 褰撳墠Servlet鐢ㄤ簬娴嬭瘯缁熻鍦ㄧ嚎浜烘暟.
 * @author JYL
 */
public class DemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("test/html charset = utf-8");

		HttpSession session = request.getSession();
		session.setAttribute("mingjiao", "zhangwuji");
		System.out.println("浜烘暟澧炲姞鍟︺�銆傘�銆�");
		
		// 灏嗙粺璁＄殑鍦ㄧ嚎浜烘暟鏄剧ず鍦ㄥ鎴风椤甸潰涓嵆鍙�
		//1 鑾峰彇ServletContext瀵硅薄
		ServletContext context = getServletContext();
		
		//2 浠嶴ervletContext瀵硅薄涓�鑾峰彇鍦ㄧ嚎缁熻浜烘暟
		int sums = (Integer)context.getAttribute("sums");
		
		//3 灏嗗湪绾跨粺璁′汉鏁板搷搴斿埌瀹㈡埛绔〉闈腑
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("褰撳墠鍦ㄧ嚎浜烘暟涓�"+sums);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
