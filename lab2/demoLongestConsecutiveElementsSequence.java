/**
 * Name:Gourab Saha
 * Description: Demo to find the longest sequence in a array of numbers
 */
package lab2;

import java.util.*;

public class demoLongestConsecutiveElementsSequence {

	private static int size1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] array = new int[size];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<size; i++) {
	         array[i] = sc.nextInt();
	      }
	      elementsSequence(array,size);

	}

	private static void elementsSequence(int[] array, int size) {
		size1=size;
		Arrays.sort(array);
		int i,flag=0;
		for(i=0;i<size1;i++) {
			if(array[i].equals(array[i+1])) {
				flag++;
			}
		}
		System.out.println(" "+flag);
	}

}
