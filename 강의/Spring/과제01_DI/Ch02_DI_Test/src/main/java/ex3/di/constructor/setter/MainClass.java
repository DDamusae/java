package ex3.di.constructor.setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX3.xml");
		StudentInfo info = (StudentInfo) ctx.getBean("studentInfo");
		info.getStudentInfo();
		Student student = (Student) ctx.getBean("student2");
		info.setStudent(student);
		info.getStudentInfo();
		ctx.close();
	}
}
