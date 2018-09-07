package test;
class Parent{
	int parentVar = 10;
	void parentMethod() {
		System.out.println("parent Method");
	}
	
}
class Child extends Parent{
	int childVar = 20;
	void childMethod(){
		System.out.println("child Method");
	}
}
public class ExtendsTest {
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println("c.parentVar = " + c.parentVar);
		System.out.println("c.childVar = " + c.childVar);
		c.parentMethod();
		c.childMethod();
	}
}
