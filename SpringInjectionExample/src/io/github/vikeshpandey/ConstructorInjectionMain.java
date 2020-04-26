package io.github.vikeshpandey;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
		Employee e = (Employee) context.getBean("e");
		e.show();
	}

}
