package lab03.exercise07;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;

	Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public void setValues(String firstName, String lastName, char gender) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
	}

	public void calculateAge() {
		LocalDate date1 = LocalDate.now();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the date in format yyyy-mm-dd: ");
		String input = sc.next();

		LocalDate date2 = LocalDate.parse(input);

		Period period = Period.between(date1, date2);
		System.out.println("difference between dates: " + period);
		sc.close();

	}

	public String getFullname() {
		return this.getFirstName() + " " + this.getLastName();
	}

	public void showDetails() {
		System.out.println("Person Details");
		System.out.println("---------------");
		System.out.println("First Name: " + getFirstName());
		System.out.println("last Name: " + getLastName());
		System.out.println("Gender : " + getGender());

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
