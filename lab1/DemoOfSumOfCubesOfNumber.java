/**
 * Name:Gourab Saha
 * Description:Demo to find the sum of the cubes of the digits of an n digit number
 * Date: 15/3/2021
 */

package lab1;

import java.util.*;

@SuppressWarnings("unused")
public class DemoOfSumOfCubesOfNumber {
	private static int number;
	private static int sum=0;
	private static int sumOfcubes(int num) {
		number=num;
		int i;
		while(number>0)
		{
			i=number%10;
			sum=(i*i*i)+sum;
			number=number/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int number;
		System.out.println("Enter The Number \n");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		 number=sc.nextInt();
		 sumOfcubes(number);
		 System.out.println("The sum of the digits is  "+sum);
		
	}

}
