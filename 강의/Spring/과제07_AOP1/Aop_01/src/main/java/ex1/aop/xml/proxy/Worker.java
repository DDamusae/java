package ex1.aop.xml.proxy;

public class Worker {
	private String name;
	private int age;
	private String job;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void getWorkerInfo() {
		try {
			Thread.sleep(19000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("직업: " + job);
	}
}
