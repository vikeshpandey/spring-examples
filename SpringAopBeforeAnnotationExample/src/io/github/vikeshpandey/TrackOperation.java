package io.github.vikeshpandey;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void k() {
	}// pointcut name

	@Pointcut("execution(* Operation.k*(..))")
	public void ok() {
	}// pointcut name

	@Before("k()") // applying pointcut on before advice
	// @After("k()")//applying pointcut on after advice
	public void myadvice(JoinPoint jp)// it is advice
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
}
