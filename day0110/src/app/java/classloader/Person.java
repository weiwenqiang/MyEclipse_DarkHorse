package app.java.classloader;

public class Person {

	private int id;
	private String name;
	private Person person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public void setPerson(Object object){
		this.person = (Person)object;
	}
	
}
