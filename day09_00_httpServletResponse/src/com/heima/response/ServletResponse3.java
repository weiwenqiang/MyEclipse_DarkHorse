package com.heima.response;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.xni.grammars.Grammar;

//输出验证码
public class ServletResponse3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建变量
		int width = 120 ;
		int height = 30 ;
		//创建一个内存图像
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB) ;
		//创建画笔
		Graphics g = image.getGraphics() ;
		//指定边框的颜色
		g.setColor(Color.RED) ;
		//画图像的边框
		g.drawRect(0, 0, width, height) ;
		
		//填充一下矩形的背景色
		//设定画笔的颜色
		g.setColor(Color.YELLOW) ;
		//填充矩形的背景
		g.fillRect(1, 1, width-2, height-2) ;
		
		//设置字体大小
		g.setFont(new Font("幼圆",Font.BOLD + Font.ITALIC,22)) ;
		
		
		
		//填充内容
		Random r = new Random() ;
		
		//设置画笔的颜色
		g.setColor(Color.GRAY) ;
		//画30条干扰线
		for (int i = 0; i < 30; i++) {
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height)) ;
		}
		
		//设定画笔的颜色
		g.setColor(Color.RED) ;
		//随机产生4个汉字
		String s = "黑马训练营北京传智播客IhavanoMoney" ;
		//先将汉字转换为unicode编码
		s = "\u9ED1\u9A6C\u8BAD\u7EC3\u8425\u5317\u4EAC\u4F20\u667A\u64AD\u5BA2IhavanoMoney" ;
		for (int i = 0; i < 4; i++) {
			char c = s.charAt(r.nextInt(s.length())) ;
			int flag = r.nextBoolean()?1:-1 ;
 			g.drawString(c+"", 20 + 20*i + flag*r.nextInt(5), 23 + flag * r.nextInt(5)) ; 
		}
		
//		//随机产生4个数字输出到页面
//		for (int i = 0; i < 4; i++) {
//			int n  = r.nextInt(10) ;
//			//画到到图片中
//			g.drawString(n+"", 20 + 20*i, 20) ;
//		}
		
		//告诉客户端不要缓存图像
		response.setHeader("Expires", -1 + "") ;
		response.setHeader("Cache-control", "no-cache") ;
		response.setHeader("Pragma", "no-cache") ;
		
		//将图片输出到客户端
		ImageIO.write(image, "jpg", response.getOutputStream()) ;
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
