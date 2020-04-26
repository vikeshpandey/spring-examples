package io.github.vikeshpandey;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml");
		Employee e = (Employee) context.getBean("obj");
		e.show();
	}

}
