package com.heima.proxy1;

public class SpringBrother implements Human {

	@Override
	public void eat() {
		System.out.println("�Է���......");
	}

	@Override
	public void sing(float money) {
		System.out.println("�õ�Ǯ�� " + money + "����");
	}

	@Override
	public void dance(float money) {
		System.out.println("�õ�Ǯ�� " + money + "����");
	}

}
