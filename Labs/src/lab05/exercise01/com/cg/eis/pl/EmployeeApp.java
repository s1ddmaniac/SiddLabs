package lab05.exercise01.com.cg.eis.pl;

import lab05.exercise01.com.cg.eis.bean.Employee;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee obj1 = new Employee(104,"Robert",25000,"Programmer");
		Employee obj2 = new Employee(124, "Downey", 17000, "System Associate");
		Employee obj3 = new Employee(144, "Juni", 45000, "Manager");
		Employee obj4 = new Employee(116, "Runi", 4200, "Clerk");
		
		obj1.findInsurance();
		obj2.findInsurance();
		obj3.findInsurance();
		obj4.findInsurance();
		
		obj1.showInfo();
		obj2.showInfo();
		obj3.showInfo();
		obj4.showInfo();		
	}
}