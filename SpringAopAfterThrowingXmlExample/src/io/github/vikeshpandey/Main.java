package io.github.vikeshpandey;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation op = (Operation) context.getBean("opBean");
		System.out.println("calling validate...");
		try {
			op.validate(19);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("calling validate again...");

		try {
			op.validate(11);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
