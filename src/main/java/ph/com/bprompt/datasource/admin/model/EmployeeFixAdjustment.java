package ph.com.bprompt.datasource.admin.model;

import ph.com.bprompt.datasource.common.model.AbstractModel;
import ph.com.bprompt.datasource.common.model.BusinessCode;

public class EmployeeFixAdjustment extends AbstractModel<Long> {

	private static final long serialVersionUID = -2980208050872767100L;
	
	private Employee employee;
	private BusinessCode adjustmentType;
	private Double amount;
	private Integer daysOfMonth; //NOTE: Ian has this as String???
	private Boolean active;
	
	public EmployeeFixAdjustment() {
		super();
	}

	public EmployeeFixAdjustment(Employee employee,
			BusinessCode adjustmentType, Double amount, Integer daysOfMonth,
			Boolean active) {
		super();
		setEmployee(employee);
		setAdjustmentType(adjustmentType);
		setAmount(amount);
		setDaysOfMonth(daysOfMonth);
		setActive(active);
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BusinessCode getAdjustmentType() {
		return adjustmentType;
	}

	public void setAdjustmentType(BusinessCode adjustmentType) {
		this.adjustmentType = adjustmentType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getDaysOfMonth() {
		return daysOfMonth;
	}

	public void setDaysOfMonth(Integer daysOfMonth) {
		this.daysOfMonth = daysOfMonth;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
