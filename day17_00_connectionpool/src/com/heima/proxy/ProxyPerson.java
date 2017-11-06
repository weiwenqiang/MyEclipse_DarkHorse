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
		System.out.println("˯��ʱ�䣺 " + System.nanoTime());
	}
	
}
