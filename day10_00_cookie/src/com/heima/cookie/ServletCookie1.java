package com.heima.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ��¼�ϴη��ʵ�ʱ��
public class ServletCookie1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8") ;
		response.setContentType("text/html;charset=UTF-8") ;
		PrintWriter out = response.getWriter() ;
		
		out.write("���ϴη��ʵ�ʱ���ǣ� ") ;
		//�õ��ͻ���Я���ļ�¼�ϴη���ʱ���Cookie : ����Cookie��������lastaccesstime , ֵ��һ��long���͵�����
		//�õ��ͻ���Я�������е�Cookie
		Cookie[] cs = request.getCookies() ;
		//ѭ���ж��õ�������Ҫ��Cookie
		for (int i = 0; cs!=null && i < cs.length; i++) {
			Cookie c = cs[i] ;
			if(c.getName().equals("lastaccesstime")){
				//˵���ҵ�����Ҫ��Cookie
				String time = c.getValue() ;
				//��timeת����long���͵�ֵ
				long t = Long.parseLong(time) ;
				//��ʽ��Ϊ������Ҫ�ĸ�ʽ
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss") ;
				//����һ��date����
				Date d = new Date(t) ;
				//�����������ҳ����
				out.write(sdf.format(d) + "&nbsp;&nbsp;<a href = '"+ request.getContextPath()+"/servlet/ServletCookie2'>���Cookie</a>") ;
			}
		}
		
		//��ͻ��˷���Cookie
		Cookie c = new Cookie("lastaccesstime",new Date().getTime() + "") ;
		
		//����Cookie�Ĵ��ʱ�䣨ֻҪ�����˴��ʱ�䣬��ô��Cookie�ͽ��洢���ͻ��˵�Ӳ���ϣ������ڻ����д洢��
		c.setMaxAge(Integer.MAX_VALUE) ;
		
		//���������Я��Cookie��·��
		c.setPath(request.getContextPath()) ;
		
		//����·�������/���Ǿ���ζ������ʷ������ϵ����⹤����Դ����Я����Cookie
		//c.setPath("/") ;  //����·���Ƿ������ĸ�·��    Э�� + ������ + �˿ں�
		
		//���͵��ͻ���
		response.addCookie(c) ;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
