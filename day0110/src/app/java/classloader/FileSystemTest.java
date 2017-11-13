package app.java.classloader;

import java.lang.reflect.Method;

public class FileSystemTest {

	public static void main(String[] args) {
		String webRootPath = "WebRoot\\WEB-INF\\classes";
		FileSystemClassLoader loader1 = new FileSystemClassLoader(webRootPath);
		FileSystemClassLoader loader2 = new FileSystemClassLoader(webRootPath);
		String className = "app.java.classloader.Person";
		try {
			Class clazz1 = loader1.findClass(className);
			Object object1 = clazz1.newInstance();
			Class clazz2 = loader2.findClass(className);
			Object object2 = clazz2.newInstance();
			
			Method method = clazz2.getMethod("setPerson",Object.class);
			method.invoke(object2, object1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
