package lab06.exercise01;

public class FullNameException extends Exception{

	private String firstName,lastName;
	
	FullNameException(String fname,String lname){
		this.firstName = fname;
		this.lastName = lname;
	}
	
	public String toString() {
		return "Name cannot be blank";
	} 
	
}
	
	
