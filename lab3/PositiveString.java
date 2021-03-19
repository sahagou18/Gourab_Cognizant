/**
 * Name:Gourab Saha
 * Description: Demo to find a positive string.
 */
package lab3;

import java.util.*;

public class PositiveString {
	
	public static void mail(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the String");
	String string=sc.next();	
    checkIfPositive(string);
	}

	private static void checkIfPositive(String pStr)
	{
		int count=0;
		for(int i=0;i<pStr.length()-1;i++)
		{
			if(pStr.charAt(i)<pStr.charAt(i+1))
				count++;
			else
				break;
			
		}
		if(count==pStr.length()-1) {
			System.out.println("Positive");;}
		else {
			System.out.println("Not Positive");;}

	}
}


