package ex2.aop.xml.advice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX2.xml");
		Student st = (Student) ctx.getBean("student");
		Worker wk = (Worker) ctx.getBean("worker");
		st.getStudentInfo();
		System.out.println();
		wk.getWorkerInfo();
		((AbstractApplicationContext) ctx).close();
	}
}
