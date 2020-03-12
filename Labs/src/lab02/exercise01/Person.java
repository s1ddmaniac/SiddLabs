package lab02.exercise01;

public class Person {

	private String firstName;
	private String lastName;
	private String gender;
	private double age;
	private double weight;

	Person(String firstName, String lastName, String gender, double age, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;

	}

	public void showPerson() {
		System.out.println("Person First Name : " + firstName);
		System.out.println("Person Last Name : " + lastName);
		System.out.println("Person Gender : " + gender);
		System.out.println("Person Age : " + age);
		System.out.println("Person Weight : " + weight);

	}
	
	public static void main(String[] args) {
		Person p = new Person("Divya", "Bharati", "F", 20, 85.5);
		
		p.showPerson();
	}

}
