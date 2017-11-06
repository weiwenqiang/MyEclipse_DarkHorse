package com.heima.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//���ڽӿڵĶ�̬����
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
		
		final SpringBrother sb = new SpringBrother() ;
		
		Human man = (Human)Proxy.newProxyInstance(sb.getClass().getClassLoader(),
				sb.getClass().getInterfaces(), 
				new InvocationHandler() {
					
				/**
				 * invoke(Object proxy, Method method, Object[] args)
				 * proxy: ������
				 * method: ����ķ���
				 * args: �����Ĳ���
				 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						if(method.getName().equals("sing")){
							//˵��Ҫ����
							float money = (Float)args[0] ;
							if(money > 1000){
								Object retVal = method.invoke(sb, money/2) ;
								return retVal;
							}else
								return null ;
						}
						if(method.getName().equals("dance")){
							//˵��Ҫ����
							float money = (Float)args[0] ;
							if(money > 2000){
								Object retVal = method.invoke(sb, money/2) ;
								return retVal ;
							}else
								return null ;
						}
						Object ret =method.invoke(sb, args) ;
						return ret ;
						
					}
				}) ;
		
		man.eat() ;
		man.sing(1500) ;
		man.dance(2500) ;
	}

}
