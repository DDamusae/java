package test2;

public class Employee extends Person {
	private String department;
	int x = 20;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void sleep() {
		System.out.println("직장인은 보통 7시간 잔다.");
	}

	@Override
	public void showSleepStyle() {
		System.out.println("직장인의 수면 스타일은 다양하다.");
	}

}
