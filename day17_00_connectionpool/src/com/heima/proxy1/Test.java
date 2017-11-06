package com.heima.proxy1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Human man = new SpringBrother() ;
//		
//		man.eat() ;
//		man.sing(100) ;
//		man.dance(200) ;
		
		Human man = new ProxyHuman(new SpringBrother()) ;
		
		man.eat() ;
		man.sing(2000) ;
		man.dance(4000) ;
		
	}

}
