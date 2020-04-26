package io.github.vikeshpandey;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {

	public void myadvice(JoinPoint jp, Object result)// it is advice (after advice)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result in advice: " + result);
		System.out.println("end of after returning advice...");
	}
}
