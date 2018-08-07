package ex1.aop.xml.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationCTX1.xml");
		Student st = (Student) ctx.getBean("student");
		Worker wk = (Worker) ctx.getBean("worker");
		st.getStudentInfo();
		System.out.println();
		wk.getWorkerInfo();
		((AbstractApplicationContext) ctx).close();
	}
}
