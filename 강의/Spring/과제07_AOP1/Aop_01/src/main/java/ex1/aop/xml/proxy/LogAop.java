package ex1.aop.xml.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString();
		StopWatch sw = new StopWatch();
		sw.start();
		System.out.println(signatureStr + " is start.");
		Object rtnObj = joinpoint.proceed();
		sw.stop();
		System.out.println(signatureStr + " is finished.");
		System.out.println(signatureStr + " 경과시간: " + sw.getTotalTimeMillis()/1000);
		return rtnObj;
	}
}
