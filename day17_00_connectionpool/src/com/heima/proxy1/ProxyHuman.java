package com.heima.proxy1;

//ģ�⶯̬�����ԭ��
public class ProxyHuman implements Human {
	
	private Human man ;
	
	public ProxyHuman(Human man) {
		this.man = man ;
	}

	@Override
	public void eat() {
		man.eat() ;
	}

	@Override
	public void sing(float money) {
		if(money > 1000)
			man.sing(money/2) ;
	}

	@Override
	public void dance(float money) {
		if(money > 2000)
			man.sing(money/2) ;
	}

}
