package com.heima.servlet;

import java.security.MessageDigest;
import java.util.UUID;

import sun.misc.BASE64Encoder;

//����Ψһֵ�����ַ�ʽ
public class Test {

	
	public static void main(String[] args) throws Exception{
		//��һ�ַ�ʽ
//		Random r = new Random() ;
//		for (int i = 0; i < 100; i++) {
//			String n = System.nanoTime() + "" + r.nextInt();   //�����ϴ����ظ��Ŀ��ܣ�ʵ���ϲ����ظ�
//			System.out.println(n) ;
//		}
		
		//�ڶ��ַ�ʽ�� ����UUID�ࣺ 
		
//		for (int i = 0; i < 100; i++) {
//			String s = UUID.randomUUID().toString() ;
//			System.out.println(s);
//		}
		
		
		for (int i = 0; i < 100; i++) {
			//�����ַ�ʽ�� ��������ָ��
			String s = UUID.randomUUID().toString() ;
			//�Ƚ���md5����
			MessageDigest md = MessageDigest.getInstance("md5") ;
			//�����ݽ��м���
			byte[] bs = md.digest(s.getBytes()) ;
			
			/**
			 * ���ֽڱ����ֽ�
			 * 00111100 01011010  00111110
			 * 00001111 00000101 00101000 00111110
			 * 0000000 -00111111
			 * 0~63
			 */
			
			//��������ָ�ƽ�һ�����ܣ��õ������ݳ�Ϊ����ָ��
			BASE64Encoder base = new BASE64Encoder() ;
			//��һ�����м���
			String str = base.encode(bs) ;
			System.out.println(str);
		}
		
	}

}
