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

//�����֤��
public class ServletResponse3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��������
		int width = 120 ;
		int height = 30 ;
		//����һ���ڴ�ͼ��
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB) ;
		//��������
		Graphics g = image.getGraphics() ;
		//ָ���߿����ɫ
		g.setColor(Color.RED) ;
		//��ͼ��ı߿�
		g.drawRect(0, 0, width, height) ;
		
		//���һ�¾��εı���ɫ
		//�趨���ʵ���ɫ
		g.setColor(Color.YELLOW) ;
		//�����εı���
		g.fillRect(1, 1, width-2, height-2) ;
		
		//���������С
		g.setFont(new Font("��Բ",Font.BOLD + Font.ITALIC,22)) ;
		
		
		
		//�������
		Random r = new Random() ;
		
		//���û��ʵ���ɫ
		g.setColor(Color.GRAY) ;
		//��30��������
		for (int i = 0; i < 30; i++) {
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height)) ;
		}
		
		//�趨���ʵ���ɫ
		g.setColor(Color.RED) ;
		//�������4������
		String s = "����ѵ��Ӫ�������ǲ���IhavanoMoney" ;
		//�Ƚ�����ת��Ϊunicode����
		s = "\u9ED1\u9A6C\u8BAD\u7EC3\u8425\u5317\u4EAC\u4F20\u667A\u64AD\u5BA2IhavanoMoney" ;
		for (int i = 0; i < 4; i++) {
			char c = s.charAt(r.nextInt(s.length())) ;
			int flag = r.nextBoolean()?1:-1 ;
 			g.drawString(c+"", 20 + 20*i + flag*r.nextInt(5), 23 + flag * r.nextInt(5)) ; 
		}
		
//		//�������4�����������ҳ��
//		for (int i = 0; i < 4; i++) {
//			int n  = r.nextInt(10) ;
//			//������ͼƬ��
//			g.drawString(n+"", 20 + 20*i, 20) ;
//		}
		
		//���߿ͻ��˲�Ҫ����ͼ��
		response.setHeader("Expires", -1 + "") ;
		response.setHeader("Cache-control", "no-cache") ;
		response.setHeader("Pragma", "no-cache") ;
		
		//��ͼƬ������ͻ���
		ImageIO.write(image, "jpg", response.getOutputStream()) ;
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
