package app.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * <servlet>
 * 	<servlet-name></servlet-name>
 * 	<servlet-class></servlet-class>
 * 	<init-param>
 * 		<param-name></param-name>
 * 		<param-value></param-value>
 * 	</init-param>
 * 	<load-on-startup>0-9</load-on-startup>
 * </servlet>
 * <servlet-mapping>
 *	<servlet-name></servlet-name>
 *	<url-pattern></url-pattern>
 * </servlet-mapping>
 */
/*@WebServlet(
	name="TestServlet",
	urlPatterns={"/test","/atest"},
	initParams={@WebInitParam(name="itheima",value="www.itheima.com")},
	loadOnStartup=0
)*/
public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}
