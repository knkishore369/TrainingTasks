package au.com.optus.rest.dto;

public class EmployeeRestBean {
	
	private String empId;
	private String empName;
	private String empSal;
	
	public EmployeeRestBean() {
	}
	
	public EmployeeRestBean(String empId,String empName, String empSal){
		
		super();
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	

}
