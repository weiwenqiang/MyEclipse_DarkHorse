package app.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest2 {

	public static void main(String[] args) {
		
		Star star = (Star)Proxy.newProxyInstance(Star.class.getClassLoader(), Fbb.class.getInterfaces(), new InvocationHandler() {
			
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return method.invoke(new Fbb(), args);
			}
		});
		
		System.out.println(star);
		
		star.movie();
		
	}
	
}
