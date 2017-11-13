package app.java.anno;

public class Fanbingbing extends Person {

	public Fanbingbing() {
		super();
	}
	@MyAnno(addr = "xxx小区", job = "jiaozhu", name = "zhangwuji")
	private int b = 0;
	
	@Override
	public void fun1() {
		String name = "fanbingbing";
	}
	@MyAnno(addr = "xxx小区", job = "zhangmen", name = "zhouzhiruo")
	public void fun3(){}
	
}
