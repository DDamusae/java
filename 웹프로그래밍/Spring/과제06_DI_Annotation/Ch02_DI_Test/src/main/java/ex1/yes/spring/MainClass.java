package ex1.yes.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX1.xml");
		MyCalculator mycal = (MyCalculator) ctx.getBean("myCalculator");
		
		mycal.add();
		mycal.sub();
		mycal.mul();
		mycal.div();
		
		ctx.close();
	}
}
