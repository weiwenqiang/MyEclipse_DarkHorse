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

//演示获取资源文件
/**
 * 获取资源文件有三种方式： 
 *              1.采用 ServletContext对象获取 
 * 				2.采用ResourceBundle类来获取 
 *  			3.采用类加载器获取
 *           
 *             第一种方式：优点： 任意文件，任意路径
 *             		       缺点： 必须有web环境
 *             第二种方式： 优点：简单方便
 *             		        缺点： 1.只能拿取properties文件 2. 只能拿取非web环境下的资源
 *             第三种方式： 优点： 任意文件，任意路径
 *             		       缺点： 编写稍显麻烦
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

	// 获取p1资源文件的内容
	public void test11() {
		// 拿到全局对象
		ServletContext sc = this.getServletContext();

		// 获取p1.properties文件的路径
		String path = sc.getRealPath("/WEB-INF/classes/p1.properties");
		System.out.println(path);
		// 创建一个Properties对象
		Properties pro = new Properties();
		// 加载文件
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取k的值
		System.out.println(pro.get("k"));
	}

	// 获取p2资源文件的内容
	public void test12() {
		// 拿到全局对象
		ServletContext sc = this.getServletContext();

		// 获取p1.properties文件的路径
		String path = sc
				.getRealPath("/WEB-INF/classes/com/heima/four/p2.properties");
		System.out.println(path);
		// 创建一个Properties对象
		Properties pro = new Properties();
		// 加载文件
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取k的值
		System.out.println(pro.get("k"));
	}

	// 获取p3资源文件的内容
	public void test13() {
		// 拿到全局对象
		ServletContext sc = this.getServletContext();

		// 获取p1.properties文件的路径
		String path = sc.getRealPath("/p3.properties");
		System.out.println(path);
		// 创建一个Properties对象
		Properties pro = new Properties();
		// 加载文件
		try {
			pro.load(new FileReader(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取k的值
		System.out.println(pro.get("k"));
	}

	// 采用resourceBunble拿取资源文件：获取p1资源文件的内容 默认路径是src，对用到web环境就是classes目录
	public void test21() {
		// 拿取ResourceBundle对象(专门用来获取properties文件的信息)
		ResourceBundle rb = ResourceBundle.getBundle("p1");
		// 拿取文件中的内容太
		System.out.println(rb.getString("k"));
	}

	// 采用resourceBunble拿取资源文件：获取p2资源文件的内容
	public void test22() {
		// 拿取ResourceBundle对象(专门用来获取properties文件的信息)
		ResourceBundle rb = ResourceBundle.getBundle("com.heima.four.p2");
		// 拿取文件中的内容太
		System.out.println(rb.getString("k"));
	}

	// 采用类加载器拿取资源文件：获取p1资源文件的内容 : 默认路径是src，对用到web环境就是classes目录
	public void test31() {
		// 获取类加载器的方式
		/*
		 * 1. 通过类名 ServletContext7.class.getClassLoader() 2. 通过对象
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * 获取Class.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("p1.properties");

		// 创建Properties对象
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 拿取文件的数据
		System.out.println(pro.getProperty("k"));

	}

	// 采用类加载器拿取资源文件：获取p2资源文件的内容 : 默认路径是src，对用到web环境就是classes目录
	public void test32() {
		// 获取类加载器的方式
		/*
		 * 1. 通过类名 ServletContext7.class.getClassLoader() 2. 通过对象
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * 获取Class.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("com/heima/four/p2.properties");

		// 创建Properties对象
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 拿取文件的数据
		System.out.println(pro.getProperty("k"));

	}

	// 采用类加载器拿取资源文件：获取p3资源文件的内容 : 默认路径是src，对用到web环境就是classes目录
	public void test33() {
		// 获取类加载器的方式
		/*
		 * 1. 通过类名 ServletContext7.class.getClassLoader() 2. 通过对象
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * 获取Class.forName("ServletContext7").getClassLoader()
		 */
		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream("../../p3.properties");

		// 创建Properties对象
		Properties pro = new Properties();
		try {
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 拿取文件的数据
		System.out.println(pro.getProperty("k"));

	}
	
	// 采用类加载器拿取资源文件：获取p3资源文件的内容 : 默认路径是src，对用到web环境就是classes目录
	public void test34() {
		// 获取类加载器的方式
		/*
		 * 1. 通过类名 ServletContext7.class.getClassLoader() 2. 通过对象
		 * this.getClass().getClassLoader() 3. Class.forName()
		 * 获取Class.forName("ServletContext7").getClassLoader()
		 */
		URL url  = this.getClass().getClassLoader().getResource("p1.properties") ;
		
		String path = url.getPath() ;
				

		// 创建Properties对象
		Properties pro = new Properties();
		try {
			pro.load(new FileReader(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 拿取文件的数据
		System.out.println(pro.getProperty("k"));

	}
}
