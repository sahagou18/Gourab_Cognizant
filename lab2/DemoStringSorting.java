/**
 * Name:Gourab Saha
 * Description: Demo Sorting in alphabatic manner
 */
package lab2;
import java.util.*;
public class DemoStringSorting {



	public static void main(String[] args) {
		DemoStringSorting obj = new DemoStringSorting();
		String[] array = obj.stringSorting();
		System.out.println("Sorted array is :: "+Arrays.toString(array));
	     
	}

	private String[] stringSorting() {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      String[] array = new String[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         array[i] = sc.nextLine();
	      }
		Arrays.sort(array);
		return array;
	}

}
