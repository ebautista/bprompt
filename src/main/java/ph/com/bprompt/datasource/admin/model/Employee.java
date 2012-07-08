package ph.com.bprompt.datasource.admin.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.lang3.ObjectUtils.Null;

import ph.com.bprompt.datasource.common.model.AbstractModel;

public class Employee extends AbstractModel<Long> {

	private static final long serialVersionUID = 4267101002284066008L;
	
	private String lastName;
	private String firstName;
	private String middleName;
	
	private Date dateHired;
	private Date dateResigned;
	private Date dateOfBirth;
	
	private String externalId;
	
	private Character gender;
	private Character civilStatus;
	
	private String tinNumber;
	
	private Collection<EmployeeContact> employeeContact = Collections.emptySet();
	private Collection<EmployeeDepartment> employeeDepartment = Collections.emptySet();
	private Collection<EmployeeContribution> employeeContribution = Collections.emptySet();
	private Collection<EmployeeSalary> employeeSalary = Collections.emptySet();
	private Collection<EmployeeTaxExemption> employeeTaxExemption = Collections.emptySet();
	private Collection<EmployeePosition> employeePosition = Collections.emptySet();
	private Collection<EmployeeFixAdjustment> employeeFixAdjustment = Collections.emptySet();
	
	public Employee() {
		super();
	}

	public Employee(String lastName, String firstName, String middleName,
			Date dateHired, Date dateResigned, Date dateOfBirth,
			String externalId, Character gender, Character civilStatus,
			String tinNumber) {
		super();
		setLastName(lastName);
		setFirstName(firstName);
		setMiddleName(middleName);
		setDateHired(dateHired);
		setDateResigned(dateResigned);
		setDateOfBirth(dateOfBirth);
		setExternalId(externalId);
		setGender(gender);
		setCivilStatus(civilStatus);
		setTinNumber(tinNumber);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public Date getDateResigned() {
		return dateResigned;
	}

	public void setDateResigned(Date dateResigned) {
		this.dateResigned = dateResigned;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Character getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(Character civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public Collection<EmployeeContact> getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(Collection<EmployeeContact> employeeContact) {
		this.employeeContact = employeeContact;
	}
	
	public Collection<EmployeeDepartment> getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(Collection<EmployeeDepartment> employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	/**
	 * Convenience method to get the active current {@link EmployeeDepartment}. It is assumed that</br> 
	 * the {@link Collection} of employeeDepartment is sorted by effectiveDate DESC</br>
	 *  
	 * @return - the active current {@link EmployeeDepartment}, {@link Null} if there is no current active {@link EmployeeDepartment}.
	 */
	public EmployeeDepartment getCurrentDepartment() {
		for (Iterator<EmployeeDepartment> iterator = employeeDepartment.iterator(); iterator.hasNext();) {
			EmployeeDepartment emplDept = (EmployeeDepartment) iterator.next();
			
			if (emplDept.isActive()) return emplDept;
		}
		
		return null;
	}
	
	public Collection<EmployeeContribution> getEmployeeContribution() {
		return employeeContribution;
	}

	public void setEmployeeContribution(Collection<EmployeeContribution> employeeContribution) {
		this.employeeContribution = employeeContribution;
	}
	
	public Collection<EmployeeSalary> getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Collection<EmployeeSalary> employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Collection<EmployeeTaxExemption> getEmployeeTaxExemption() {
		return employeeTaxExemption;
	}

	public void setEmployeeTaxExemption(
			Collection<EmployeeTaxExemption> employeeTaxExemption) {
		this.employeeTaxExemption = employeeTaxExemption;
	}

	public Collection<EmployeePosition> getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(Collection<EmployeePosition> employeePosition) {
		this.employeePosition = employeePosition;
	}

	public Collection<EmployeeFixAdjustment> getEmployeeFixAdjustment() {
		return employeeFixAdjustment;
	}

	public void setEmployeeFixAdjustment(Collection<EmployeeFixAdjustment> employeeFixAdjustment) {
		this.employeeFixAdjustment = employeeFixAdjustment;
	}

	@Override
	public String toString() {
		return "Employee [" 
				+ "id=" + getId() + CONST_STRING_SEPARATOR
				+ "lastName=" + getLastName() + CONST_STRING_SEPARATOR
				+ "firstName=" + getFirstName() + CONST_STRING_SEPARATOR
				+ "middleName=" + getMiddleName() + CONST_STRING_SEPARATOR 
				+ "dateHired=" + getDateHired() + CONST_STRING_SEPARATOR
				+ "dateResigned=" + getDateResigned() + CONST_STRING_SEPARATOR
				+ "dateOfBirth=" + getDateOfBirth() + CONST_STRING_SEPARATOR
				+ "externalId=" + getExternalId() + CONST_STRING_SEPARATOR
				+ "gender=" + getGender() + CONST_STRING_SEPARATOR
				+ "civilStatus=" + getCivilStatus() + CONST_STRING_SEPARATOR
				+ "tinNumber=" + getTinNumber()
				+ "]\n";
	}
}
