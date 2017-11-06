package com.heima.proxy;

public class Test {

	public static void main(String[] args) {
		ProxyPerson p = new ProxyPerson(new  Person()) ;
		
		p.eat() ;
		p.sleep() ;
	}
}
