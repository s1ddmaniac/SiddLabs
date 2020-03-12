package lab05.exercise01.com.cg.eis.service;

public class ServiceClass implements EmployeeService {

	private String insuranceScheme;
	private String designation;
	private int salary;
	
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public void findScheme() {
		
		if(designation.equals("System Associate") && salary <20000 && salary >5000) 
		{
			insuranceScheme = "Scheme C";
		}
		else if(designation.equals("Manager") && salary >= 40000) 
		{
			insuranceScheme = "Scheme A";
		}
		else if(designation.equals("Programmer") && salary >= 20000 && salary < 40000) 
		{
			insuranceScheme = "Scheme B";
		}
		else 
		{
			insuranceScheme = "No scheme";
		}
	
	}
	
	@Override
	public String toString() 
	{
		return "Insurance scheme: " + insuranceScheme;
	}
	
	//Constructor
	public ServiceClass(String designation,int salary)
	{
		this.designation = designation;
		this.salary = salary;
	}
	
}
