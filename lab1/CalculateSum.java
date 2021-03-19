/**
 * Name:Gourab Saha
 * Description: Demo to find the sum of n numbers divisible by 3 or 5.
 */
import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int range=sc.nextInt();
		System.out.println("The sum of natural number upto "+range+" is:"+calculateSum(range));
		

	}
	private static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

	}


