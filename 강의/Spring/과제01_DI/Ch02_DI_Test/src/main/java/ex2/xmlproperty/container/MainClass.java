package ex2.xmlproperty.container;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX2.xml");
		MyInfo myInfo = (MyInfo) ctx.getBean("myInfo");
		myInfo.getInfo();
		myInfo.getBmiCalculator();
		
		ctx.close();
	}
}
