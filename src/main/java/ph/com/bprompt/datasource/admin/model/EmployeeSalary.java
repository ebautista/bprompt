package ph.com.bprompt.datasource.admin.model;

import java.util.Date;

import ph.com.bprompt.datasource.common.model.DateExpirableWithId;

public class EmployeeSalary extends DateExpirableWithId<Long> {

	private static final long serialVersionUID = -855385894843502563L;
	
	private Employee employee;
	private SalaryType salaryType;
	private Double basicPay;
	
	public EmployeeSalary() {
		super();
	}

	public EmployeeSalary(Employee employee, SalaryType salaryType,
			Double basicPay, Date fromDate, Date untilDate) {
		super();
		setEmployee(employee);
		setSalaryType(salaryType);
		setBasicPay(basicPay);
		setFromDate(fromDate);
		setUntilDate(untilDate);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public SalaryType getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(SalaryType salaryType) {
		this.salaryType = salaryType;
	}

	public Double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}
}
