package app.java.async;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/async"},asyncSupported=true)
public class AsyncServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {

		// 设置响应类型及编码格式
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("马上开始：<br/>");
		// 刷新缓冲区
		response.getWriter().flush();
		
		final AsyncContext context = request.startAsync(request, response);
		
		context.start(new Runnable() {
			
			@Override
			public void run() {
				try {
					for (char ch = 'A'; ch <= 'Z'; ch++) {
						response.getWriter().print(ch);
						response.getWriter().flush();
						Thread.sleep(250);
					}
					// 表示异步处理完毕
					context.complete();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
