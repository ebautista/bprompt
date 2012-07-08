package ph.com.bprompt.datasource.admin.model;

import ph.com.bprompt.datasource.common.model.AbstractModel;

public class EmployeeContribution extends AbstractModel<Long> {

	private static final long serialVersionUID = -1767531896736438639L;
	
	private Employee employee;
	private Contribution contribution;
	private String idNumber;
	
	public EmployeeContribution() {
		super();
	}

	public EmployeeContribution(Employee employee, Contribution contribution,
			String idNumber) {
		super();
		this.employee = employee;
		this.contribution = contribution;
		this.idNumber = idNumber;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Contribution getContribution() {
		return contribution;
	}

	public void setContribution(Contribution contribution) {
		this.contribution = contribution;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
}
