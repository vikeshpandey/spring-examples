package io.github.vikeshpandey;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");

		dao.saveEmployee(new Employee(103, "Amit", 35000));
		System.out.println("record successfully saved");

		/*
		 * int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		 * System.out.println(status);
		 */

		/*
		 * Employee e=new Employee(); e.setId(102); int status=dao.deleteEmployee(e);
		 * System.out.println(status);
		 */

	}

}
