package com.heima.proxy3;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//基本子类的动态代理
public class Test {

	public static void main(String[] args) {
		/**
		 * Enhancer.create(type, callback):
		 * type:是被代理对象的类型
		 * callback: 相当于Proxy类中的 invocationHandler
		 */
		final SpringBrother sb = new SpringBrother() ;
		SpringBrother h =  (SpringBrother)Enhancer.create(SpringBrother.class, new MethodInterceptor(){
			@Override
			public Object intercept(Object arg0, Method method, Object[] args,
					MethodProxy arg3) throws Throwable {
				if(method.getName().equals("sing")){
					//说明要唱歌
					float money = (Float)args[0] ;
					if(money > 1000){
						Object retVal = method.invoke(sb, money/2) ;
						return retVal;
					}else
						return null ;
				}
				if(method.getName().equals("dance")){
					//说明要唱歌
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
		
		
		h.eat() ;
		h.sing(1500) ;
		h.dance(2500) ;
	}
}
