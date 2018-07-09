package test;

class Person {
	int age;
	String name;
	int height;
	int weight;

	// 생성자
	public Person() {
		super();
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println("person1.name = " + person1.name + ", person1.height = " + person1.height
				+ ", person1.weight = " + person1.weight + ", person1.age = " + person1.age);

		Person person2 = new Person(30);
		System.out.println("person2.name = " + person2.name + ", person2.height = " + person2.height
				+ ", person2.weight = " + person2.weight + ", person2.age = " + person2.age);

		Person person3 = new Person("goodman");
		System.out.println("person3.name = " + person3.name + ", person3.height = " + person3.height
				+ ", person3.weight = " + person3.weight + ", person1.age = " + person3.age);

	}
}
