package io.github.vikeshpandey;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		Employee employee = new Employee(102, "Amit", 35000);
//		int status = dao.saveEmployee(employee);
//		System.out.println("number of rows affected: " + status);

		/*
		 * int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		 * System.out.println(status);
		 */

		int status = dao.deleteEmployee(employee);
		System.out.println("number of rows affected" + status);

	}

}
