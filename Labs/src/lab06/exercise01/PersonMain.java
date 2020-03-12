package lab06.exercise01;

public class PersonMain {

	public static void main(String[] args) {
		try
		{
			Person person = new Person("Sidd","",'M');
		System.out.println("First Name: " + person.getFirstName());
		System.out.println("Last Name: " + person.getLastName());
		System.out.println("Gender: " + person.getGender());
		}
		catch(FullNameException e) {
			System.out.println(e);
		}
	}

}
