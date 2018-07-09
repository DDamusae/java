package p06.array;

public class Person {
	int age;
	String name;
	
	public Person() {
		
	}
	
	public Person(String s) {
		this.name = s;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
