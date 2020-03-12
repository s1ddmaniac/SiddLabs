package lab03.exercise06;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

//3.6: Create a method which accept zone id and print the current date and time with respect to
//given zone. (Hint: Few zones to test your code. America/New_York, Europe/London, Asia/Tokyo,
//US/Pacific, Africa/Cairo, Australia/Sydney etc.)

public class ZoneIdDatePrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the zone id COUNTRY/CITY: ");
		String zone = sc.next();
		ZoneId zoneid = ZoneId.of(zone);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), zoneid);
		System.out.println("time of zone " + zone + ": " + zonedDateTime2);
		sc.close();
	}

}
