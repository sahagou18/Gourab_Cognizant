/**
 * Name:Gourab Saha
 * Description: Demo Array Operations
 */
package lab2;
import java.util.*;

public class DemoArrayOperation {

	public static void main(String[] args) {
		int positiveNumber=0,negetiveNumber=0,evenNumber=0,oddNumber=0,zeros=0;
		Scanner sc=new Scanner(System.in);
		int[] array = new int[20];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<20; i++)  
		{     
		array[i]=sc.nextInt();  
		} 
		//1.Positive Number
		for(int i=0; i<20; i++) {
			if(array[i]>0) {
				positiveNumber++;
			}
		}
		System.out.println("The number of positive numbers are"+positiveNumber);
		//2.Negetive Number
		for(int i=0; i<20; i++) {
			if(array[i]<0) {
				negetiveNumber++;
			}
		}
		System.out.println("The number of negetive numbers are"+negetiveNumber);
		//3.Odd Number & Even Number
		for(int i=0; i<20; i++) {
			if(array[i]%2==0) {
				evenNumber++;
			}
			else {
				oddNumber++;
			}
		}
		System.out.println("The number of odd numbers are"+oddNumber);
		System.out.println("The number of even numbers are"+evenNumber);
		
		//4. Number of zeros
		for(int i=0; i<20; i++) {
			if(array[i]==0) {
				zeros++;
			}
		}
		System.out.println("The number of positive numbers are"+zeros);
	}

}
