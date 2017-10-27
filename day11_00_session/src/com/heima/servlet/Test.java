package com.heima.servlet;

import java.security.MessageDigest;
import java.util.UUID;

import sun.misc.BASE64Encoder;

//创建唯一值的三种方式
public class Test {

	
	public static void main(String[] args) throws Exception{
		//第一种方式
//		Random r = new Random() ;
//		for (int i = 0; i < 100; i++) {
//			String n = System.nanoTime() + "" + r.nextInt();   //理论上存在重复的可能，实际上不会重复
//			System.out.println(n) ;
//		}
		
		//第二种方式： 采用UUID类： 
		
//		for (int i = 0; i < 100; i++) {
//			String s = UUID.randomUUID().toString() ;
//			System.out.println(s);
//		}
		
		
		for (int i = 0; i < 100; i++) {
			//第三种方式： 采用数据指纹
			String s = UUID.randomUUID().toString() ;
			//先进行md5加密
			MessageDigest md = MessageDigest.getInstance("md5") ;
			//对数据进行加密
			byte[] bs = md.digest(s.getBytes()) ;
			
			/**
			 * 三字节变四字节
			 * 00111100 01011010  00111110
			 * 00001111 00000101 00101000 00111110
			 * 0000000 -00111111
			 * 0~63
			 */
			
			//采用数据指纹进一步加密，拿到的数据成为数据指纹
			BASE64Encoder base = new BASE64Encoder() ;
			//进一步进行加密
			String str = base.encode(bs) ;
			System.out.println(str);
		}
		
	}

}
