package app.java.proxy;

public class Fbb implements Star {

	public void song(String name) {
		System.out.println(name+" song........");
		
	}

	public String movie() {
		System.out.println("movie........");
		return "武媚娘传奇,禁播了!!!";
	}

}
