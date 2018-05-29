package p05.reference.polymorphism;

public class MainInstance {
	public static void main(String[] args) {
		Parent p = new Child();
		Child.show(p);
	}
}
