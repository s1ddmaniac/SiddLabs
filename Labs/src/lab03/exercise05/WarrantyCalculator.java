package lab03.exercise05;
import java.time.LocalDate;
import java.util.Scanner;

//3.5: Create a method to accept product purchase date 
//and warrantee period (in terms of months
//and years). Print the date on which warrantee 
//of product expires.

public class WarrantyCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in yyyy-mm-dd :");
		String input = sc.next();
		LocalDate date = LocalDate.parse(input);

		System.out.println("Enter the warranty period:");
		System.out.println("years:");
		int years = sc.nextInt();
		System.out.println("months:");
		int months = sc.nextInt();

		date = date.plusYears(years);
		date = date.plusMonths(months);
		System.out.println("Last Date: " + date);
		sc.close();
	}

}
