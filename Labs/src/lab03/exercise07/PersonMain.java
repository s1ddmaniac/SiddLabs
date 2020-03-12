//3.7: Modify Lab assignment 2.3 to perform following
//functionalities:
//a) Add a method called calculateAge which should
//accept person’s date of birth and
//calculate age of a person.
//b) Add a method called
//getFullName(String firstName, String lastName) which should
//return full name of a person

package lab03.exercise07;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("Divya", "Bharathi", 'F');
		p.showDetails();
		p.calculateAge();
		System.out.println(p.getFullname());
	}

}
