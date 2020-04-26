package io.github.vikeshpandey;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterThrowing(pointcut = "execution(* Operation.*(..))", throwing = "error")
	public void myadvice(JoinPoint jp, Throwable error) {
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
	}
}
