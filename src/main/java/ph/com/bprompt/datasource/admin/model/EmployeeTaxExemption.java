package ph.com.bprompt.datasource.admin.model;

import java.util.Date;

import ph.com.bprompt.datasource.common.model.DateExpirableWithId;

public class EmployeeTaxExemption extends DateExpirableWithId<Long> {

	private static final long serialVersionUID = 5712643762098416599L;
	
	private Employee employee;
	private TaxExemption taxExemptionType;
	
	public EmployeeTaxExemption() {
		super();
	}

	public EmployeeTaxExemption(Employee employee, TaxExemption taxExemptionType,
			Date fromDate, Date untilDate) {
		super();
		setEmployee(employee);
		setTaxExemptionType(taxExemptionType);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public TaxExemption getTaxExemptionType() {
		return taxExemptionType;
	}

	public void setTaxExemptionType(TaxExemption taxExemptionType) {
		this.taxExemptionType = taxExemptionType;
	}
}
