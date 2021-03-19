/**
 * Name:Gourab Saha
 * Description: Demo to find the Difference of the digits of a number  and make a digit
 */
package lab3;

import java.util.Scanner;
import java.lang.Math;

public class DiffOfDigits {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("the modified number is "+modifyNumber(number));
	}
    private static int modifyNumber(int number1)
    {
    	String str=Integer.toString(number1);
    	int output=0;
    	for(int i=0;i<str.length()-1;i++)
    	{
    		int diff=str.charAt(i)-str.charAt(i+1);
    		output=output*10+Math.abs(diff);
    	}
    	output=output*10+(str.charAt(str.length()-1))-48;
    	return output;
    }
}
