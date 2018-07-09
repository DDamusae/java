package p05.map.hashmap;

public class User {
	private String id, password, dong;
	private int age;
	private String name;
	
	public User(String id, String password, String dong, int age, String name) {
		super();
		this.id = id;
		this.password = password;
		this.dong = dong;
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "ID: " + id + ", Password: " + password + ", name" + name + ", age: " + age + ", dong: " + dong;
	}
}
