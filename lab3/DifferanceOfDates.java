/**
 * Name:Gourab Saha
 * Description: Demo to find the difference between two dates.
 */
package lab3;
import java.util.*;
import java.time.*;
public class DifferanceOfDates {

	public static void main(String[] args) {
		datediff();

	}

	private static void datediff() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		System.out.println("Enter the month");
		int month=sc.nextInt();
		System.out.println("Enter the date");
		int date=sc.nextInt();
		
		LocalDate previousDate = LocalDate.of(year,month,date);
		LocalDate now = LocalDate.now();
		 
		Period diff = Period.between(previousDate, now);
		 
		System.out.printf("Difference is"+diff.getYears()+ "years " +diff.getMonths()+ " months and " +diff.getDays()+ " days");
	}

	
}
