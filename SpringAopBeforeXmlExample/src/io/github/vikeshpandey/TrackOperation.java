package io.github.vikeshpandey;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {

	public void myadvice(JoinPoint jp)// it is advice
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
}
