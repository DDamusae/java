package test2;

public class OverridingTest {
	public static void main(String[] args) {
		Person person = new Person();
		Employee employee = new Employee();
		
		System.out.println("employee.x = " + employee.x);
		System.out.println("person.x = " + person.x);
		
		employee.sleep();
		employee.showSleepStyle();
	}
}
