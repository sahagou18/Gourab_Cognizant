/**
 * Name:Gourab Saha
 * Description: Demo to the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 */

import java.util.Scanner;
import java.lang.Math;
public class CalculateDifference {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
        System.out.println("The difference is:"+calculateDifference(range));
	}
    private static int calculateDifference(int n)
    {
    	int sum=0;
    	int sumOfN=0,sumOfSquares=0;
    	sumOfN=(n*(n+1)/2);
    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
    	sum=(sumOfN*sumOfN)-sumOfSquares;
    	return sum;
    }
}
