package test;

class OverridingParent{
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent{
	@Override
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}
