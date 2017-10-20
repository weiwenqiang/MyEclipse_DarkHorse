package com.heima.four;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��ʾ��ȡ��Դ�ļ�
/**
 * ��ȡ��Դ�ļ������ַ�ʽ�� 
 *              1.���� ServletContext�����ȡ 
 * 				2.����ResourceBundle������ȡ 
 *  			3.�������������ȡ
 *           
 *             ��һ�ַ�ʽ���ŵ㣺 �����ļ�������·��
 *             		       ȱ�㣺 ������web����
 *             �ڶ��ַ�ʽ�� �ŵ㣺�򵥷���
 *             		        ȱ�㣺 1.ֻ����ȡproperties�ļ� 2. ֻ����ȡ��web�����µ���Դ
 *             �����ַ�ʽ�� �ŵ㣺 �����ļ�������·��
 *             		       ȱ�㣺 ��д�����鷳
 *             		  
 * 
 * @author Administrator
 * 
 */
public class ServletContext7 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//test11() ;
		// test12() ;
		// test13();
		// test22();
		// test31();
//		test32();
//		test33();
	//	test34();

	}

	// ��ȡp1��Դ�ļ�������
	public void test11() {
		// �õ�ȫ�ֶ���
		ServletContext sc = this.getServletContext();

		// ��ȡp1.properties�ļ���·��
		String path = sc.getRealPath("/WEB-INF/classes/p1.properties");
		System.out.println(path);
		// ����һ��Properties����
		Properties pro = new Properties();
		// �����ļ�
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��ȡk��ֵ
		System.out.println(pro.get("k"));
	}

	// ��ȡp2��Դ�ļ�������
	public void test12() {
		// �õ�ȫ�ֶ���
		ServletContext sc = this.getServletContext();

		// ��ȡp1.properties�ļ���·��
		String path = sc
				.getRealPath("/WEB-INF/classes/com/heima/four/p2.properties");
		System.out.println(path);
		// ����һ��Properties����
		Properties pro = new Properties();
		// �����ļ�
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��ȡk��ֵ
		System.out.println(pro.get("k"));
	}

	// ��ȡp3��Դ�ļ�������
	public void test13() {
		// �õ�ȫ�ֶ���
		ServletContext sc = this.getServletContext();

		// ��ȡp1.properties�ļ���·��
		String path = sc.getRealPath("/p3.properties");
		System.out.println(path);
		// ����һ��Properties����
		Properties pro = new Properties();
		// �����ļ�
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��ȡk��ֵ
		System.out.println(pro.get("k"));
	}

	// ����resourceBunble��ȡ��Դ�ļ�����ȡp1��Դ�ļ������� Ĭ��·����src�����õ�web��������classesĿ¼
	public void test21() {
		// ��ȡResourceBundle����(ר��������ȡproperties�ļ�����Ϣ)
		ResourceBundle rb = ResourceBundle.getBundle("p1");
		// ��ȡ�ļ��е�����̫
		System.out.println(rb.getString("k"));
	}

	// ����resourceBunble��ȡ��Դ�ļ�����ȡp2��Դ�ļ�������
	public void test22() {
		// ��ȡResourceBundle����(ר��������ȡproperties�ļ�����Ϣ)
		ResourceBundle rb = ResourceBundle.getBundle("com.heima.four.p2");
		// ��ȡ�ļ��е�����̫
		System.out.println(rb.getString("k"));
	}

	// �������������ȡ��Դ�ļ�����ȡp1��Դ�ļ������� : Ĭ��·����src�����õ�web��������classesĿ¼
	public void test31() {
		// ��ȡ��������ķ�ʽ
		/*
		 * 1. ͨ������ ServletContext7.class.getClassLoader() 2. ͨ������
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * ��ȡClass.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("p1.properties");

		// ����Properties����
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ȡ�ļ�������
		System.out.println(pro.getProperty("k"));

	}

	// �������������ȡ��Դ�ļ�����ȡp2��Դ�ļ������� : Ĭ��·����src�����õ�web��������classesĿ¼
	public void test32() {
		// ��ȡ��������ķ�ʽ
		/*
		 * 1. ͨ������ ServletContext7.class.getClassLoader() 2. ͨ������
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * ��ȡClass.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("com/heima/four/p2.properties");

		// ����Properties����
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ȡ�ļ�������
		System.out.println(pro.getProperty("k"));

	}

	// �������������ȡ��Դ�ļ�����ȡp3��Դ�ļ������� : Ĭ��·����src�����õ�web��������classesĿ¼
	public void test33() {
		// ��ȡ��������ķ�ʽ
		/*
		 * 1. ͨ������ ServletContext7.class.getClassLoader() 2. ͨ������
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * ��ȡClass.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("../../p3.properties");

		// ����Properties����
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ȡ�ļ�������
		System.out.println(pro.getProperty("k"));

	}
	
	// �������������ȡ��Դ�ļ�����ȡp3��Դ�ļ������� : Ĭ��·����src�����õ�web��������classesĿ¼
	public void test34() {
		// ��ȡ��������ķ�ʽ
		/*
		 * 1. ͨ������ ServletContext7.class.getClassLoader() 2. ͨ������
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * ��ȡClass.forName("ServletContext7").getClassLoader()
		 */
		URL url  = this.getClass().getClassLoader().getResource("p1.properties") ;
		
		String path = url.getPath() ;
				

		// ����Properties����
		Properties pro = new Properties();
		try {
			pro.load(new FileReader(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ȡ�ļ�������
		System.out.println(pro.getProperty("k"));

	}
}
