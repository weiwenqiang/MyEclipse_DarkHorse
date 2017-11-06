package com.heima.proxy1;

public class SpringBrother implements Human {

	@Override
	public void eat() {
		System.out.println("³Ô·¹ÖĞ......");
	}

	@Override
	public void sing(float money) {
		System.out.println("ÄÃµ½Ç®£º " + money + "¿ª³ª");
	}

	@Override
	public void dance(float money) {
		System.out.println("ÄÃµ½Ç®£º " + money + "ÌøÎè");
	}

}
