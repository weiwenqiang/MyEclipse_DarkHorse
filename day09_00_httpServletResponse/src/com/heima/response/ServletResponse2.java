package com.heima.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//��ʾ�����ļ����ļ�������
public class ServletResponse2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡ�ļ���·��
		String path = getServletContext().getRealPath("/WEB-INF/classes/��Ů.jpg") ;  //Ĭ�ϴӹ���·����ʼ
		
		//����������
		InputStream is = new FileInputStream(path) ;
		byte[] bs = new byte[1024] ;
		int b = 0 ;
		
		//�������������
		ServletOutputStream os = response.getOutputStream() ;
		
		//�����Ľ��б���
		//�õ����ĵ��ļ���
		String name = path.substring(path.lastIndexOf("\\") + 1, path.length()) ;
		System.out.println(name);
		
		//�������ļ������б���
		name = URLEncoder.encode(name, "utf-8") ;
		System.out.println("����� " + name);
		
		//֪ͨ����������صķ�ʽ���ļ�
		response.setHeader("Content-Disposition", "attachment;filename=" + name) ;
		
		while((b = is.read(bs)) != -1){
			os.write(bs,0,b) ;
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
