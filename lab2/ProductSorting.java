/**
 * Name:Gourab Saha
 * Description: Demo to sort the product.
 */
package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      String[] array = new String[size];
	      System.out.println("Enter the Name of product ::");

	      for(int i=0; i<size; i++) {
	         array[i] = sc.next();
	      }
	      sortedProduct(array);

}

	private static void sortedProduct(String[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
}