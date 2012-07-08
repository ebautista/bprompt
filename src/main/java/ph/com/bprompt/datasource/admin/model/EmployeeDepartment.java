package ph.com.bprompt.datasource.admin.model;

import java.util.Date;

import ph.com.bprompt.datasource.common.model.DateExpirableWithId;

public class EmployeeDepartment extends DateExpirableWithId<Long> {

	private static final long serialVersionUID = 5379863303763624987L;
	
	private Employee employee;
	private Department department;
	
	public EmployeeDepartment() {
		super();
	}

	public EmployeeDepartment(Employee employee, Department department,
			Date fromDate, Date untilDate) {
		super();
		setEmployee(employee);
		setDepartment(department);
		setFromDate(fromDate);
		setUntilDate(untilDate);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
