package app.java.anno;

import java.util.ArrayList;
import java.util.List;

public class Person implements Star {

	public void fun1() {

		@SuppressWarnings({ "unused", "rawtypes" })
		List list = new ArrayList();
		
	}
	
	@Deprecated
	public void fun2(){
		
	}

}
