package lab05.exercise01.com.cg.eis.bean;

import lab05.exercise01.com.cg.eis.service.ServiceClass;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String desgination;
	private String insuranceScheme;
	private ServiceClass service;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public Employee(int id, String name, int salary, String desgination) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desgination = desgination;
	}

	public void findInsurance() 
	{
		service = new ServiceClass(desgination,salary);
		service.findScheme();
		this.insuranceScheme = service.getInsuranceScheme();
	}
	
	public void showInfo() 
	{
		System.out.println("<----------Employee details -------->");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Designation: " + desgination);
		System.out.println("Salary: " + salary);
		System.out.println("Insurance scheme: " + insuranceScheme);
	}
}