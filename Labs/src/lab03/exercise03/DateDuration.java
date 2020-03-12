package lab03.exercise03;

import java.time.LocalDate;
import java.time.Period;

public class DateDuration {
	public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2011, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
