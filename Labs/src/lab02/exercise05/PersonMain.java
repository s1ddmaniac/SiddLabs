package lab02.exercise05;

import java.util.Scanner;

import lab02.exercise05.Person;
import lab02.exercise05.Person.Gender;

public class PersonMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the gender: ");
		char gender = s.next().charAt(0);
		Person p;
		if(gender=='M')
			 p = new Person("Divya", "Bharathi", Gender.M);
		else if(gender=='F')
			 p = new Person("Divya", "Bharathi", Gender.F);
		else
			 p = new Person("Divya", "Bharathi", Gender.N);
		p.setNumber();
		p.showDetails();
	}

}
