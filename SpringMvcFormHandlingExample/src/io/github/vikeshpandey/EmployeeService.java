package io.github.vikeshpandey;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	
	public EmployeeService(EmployeeDao dao) {
		this.employeeDao = employeeDao;
	}
	
	public void createEmployee(Employee employee) {
		employeeDao.create(employee);
	}


}
