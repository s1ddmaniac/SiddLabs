package lab03.exercise04;

import java.time.LocalDate;
import java.time.Period;

public class DateDuration {
	public static void main(String[] args)
    {
        LocalDate pdate1 = LocalDate.of(2011, 01, 01);
        LocalDate pdate2 = LocalDate.of(2014, 05, 12);
 
        Period diff = Period.between(pdate1, pdate2);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}