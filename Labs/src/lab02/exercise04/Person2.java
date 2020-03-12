package lab02.exercise04;

import java.util.Scanner;

public class Person2 {
	protected String firstName;
	protected String lastName;
	protected char gender;
	protected long phoneNumber;
	
	Person2(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;

	}
	
	public void personDetails() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		phoneNumber = scanner.nextLong();
	}
		
	public void getPerson2() {
		System.out.println("Person First Name : " + firstName);
		System.out.println("Person Last Name : " + lastName);
		System.out.println("Person Gender : " + gender);
		System.out.println("Person Phone Number : " + phoneNumber);
	}

}
