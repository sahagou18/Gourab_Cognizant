/**
 * Name:Gourab Saha
 * Description: Demo Second Smallest Number in an array
 */
package lab2;
import java.util.*;

public class DemoSecondSmallesNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] array = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         array[i] = sc.nextInt();
	      }
	     int secondSmallestNumber= getSecondSmallestNumber(array);
	     System.out.println("Second Smallest Number is " +secondSmallestNumber);
	}

	private static int getSecondSmallestNumber(int[] array) {
		Arrays.sort(array);
		int secondSmallestNumber= array[1] ;
		return secondSmallestNumber;
		
	}

}
