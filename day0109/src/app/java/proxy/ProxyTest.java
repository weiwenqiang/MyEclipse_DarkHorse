package app.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

	public static void main(String[] args) {
		
		/**
		 * Proxy类的newProxyInstance(ClassLoader，Class[])方法:
		 *  * 获取对应委托类的代理对象.
		 *  * 参数一:指定对应委托类的类加载器.
		 *  * 参数二:指定委托类的Class
		 *  * 参数三:InvocationHandler的实例(重写invoke)
		 *  
		 *  动态代理的作用:
		 *   * 不需要得到对应委托类的对象.
		 *   * 通过代理类对象,对委托类的方法进行过滤(修改)等.
		 */
		Star fbb = (Star)Proxy.newProxyInstance(Star.class.getClassLoader(), Fbb.class.getInterfaces(), new InvocationHandler() {
			/**
			 * invoke(Object proxy, Method method, Object[] args)
			 *  * 该方法的作用:调用对应的委托类的方法.
			 *  * 参数一:返回的是代理类对象.
			 *  * 参数二:返回的是对应委托类方法的Method类型对象.
			 *  * 参数三:返回的是对应委托类方法接收的实参.
			 */
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// 可以获取到对应委托类方法的参数.
				/*String name = (String)args[0];
				if(name.equals("zhangwuji")){
					method.invoke(new Fbb(), "zhouzhiruo");
				}*/
				// 阻止调用对应委托类的方法
				/*String methodName = method.getName();
				if(methodName.equals("movie")){
					System.out.println("范冰冰最近太累了,不能拍电影,改唱歌了!");
				}*/
				// 修改委托类方法的返回值
				String methodName = method.getName();
				if(methodName.equals("movie")){
					return "武媚娘传奇,重播了!!!";
				}
				
				return null;
			}
		});
		
//		fbb.song("zhangwuji");
		String value = fbb.movie();
		System.out.println(value);
	}
	
}
