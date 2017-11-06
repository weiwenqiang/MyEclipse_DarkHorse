package com.heima.proxy;

public class ProxyPerson {

	private Person p ;
	
	public ProxyPerson(Person p) {
		this.p = p ;
	}
	
	public void eat() {
		p.eat() ;
	}
	
	
	public void sleep(){
		p.sleep() ;
		System.out.println("Ë¯¾õÊ±¼ä£º " + System.nanoTime());
	}
	
}
