package app.java.classloader;

public class SystemTest {

	public static void main(String[] args) {
		ClassLoader classLoader = SystemTest.class.getClassLoader();
		System.out.println(classLoader);
	}
	
}
