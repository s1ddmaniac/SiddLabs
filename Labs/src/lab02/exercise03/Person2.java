package lab02.exercise03;

public class Person2 {
	protected String firstName;
	protected String lastName;
	protected char gender;
	
	Person2(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void getPerson2() {
		System.out.println("Person First Name : " + firstName);
		System.out.println("Person Last Name : " + lastName);
		System.out.println("Person Gender : " + gender);
	}

}
