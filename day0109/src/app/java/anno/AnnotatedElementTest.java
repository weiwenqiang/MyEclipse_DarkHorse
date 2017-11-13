package app.java.anno;

import java.lang.reflect.Method;

/**
 * 用于测试通过反射读取具体的注解内容.
 * @author JYL
 */
public class AnnotatedElementTest {

	public static void main(String[] args) throws Exception {
		//1 获取对应类的Class类对象
		Class clazz = Fanbingbing.class;
		
		//2 根据Class类对象获取Method或Field
		Method method = clazz.getDeclaredMethod("fun3");
		
		//3 通过Class类对象、Metod对象、Field对象,获取对应的注解信息.
		MyAnno myAnno = method.getAnnotation(MyAnno.class);
		
		//4 测试
		System.out.println(myAnno.name());
	}
	
}
