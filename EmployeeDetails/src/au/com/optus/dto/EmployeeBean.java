package au.com.optus.dto;

public class EmployeeBean {

	private String employeeId;
	private String empoyeeName;
	private String employeeSalary;
	private String employeeLocation;
	
	public EmployeeBean(){}
	
	public EmployeeBean(String employeeId, String empoyeeName, String employeeSalary, String employeeLocation)
	{
		super();  
		this.employeeId = employeeId;
		this.empoyeeName = empoyeeName;
		this.employeeSalary = employeeSalary;
		this.employeeLocation = employeeLocation;
	}

	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpoyeeName() {
		return empoyeeName;
	}
	public void setEmpoyeeName(String empoyeeName) {
		this.empoyeeName = empoyeeName;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	
}
