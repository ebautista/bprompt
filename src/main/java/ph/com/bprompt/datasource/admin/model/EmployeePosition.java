package ph.com.bprompt.datasource.admin.model;

import java.util.Date;

import ph.com.bprompt.datasource.common.model.BusinessCode;
import ph.com.bprompt.datasource.common.model.DateExpirableWithId;

public class EmployeePosition extends DateExpirableWithId<Long> {

	private static final long serialVersionUID = 2184005523644599433L;
	
	private Employee employee;
	private BusinessCode position;
	
	public EmployeePosition() {
		super();
	}

	public EmployeePosition(Employee employee, BusinessCode position,
			Date fromDate, Date untilDate) {
		super();
		setEmployee(employee);
		setPosition(position);
		setFromDate(fromDate);
		setUntilDate(untilDate);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BusinessCode getPosition() {
		return position;
	}

	public void setPosition(BusinessCode position) {
		this.position = position;
	}
}
