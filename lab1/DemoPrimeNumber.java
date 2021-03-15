package lab1;

import java.util.Scanner;

public class DemoPrimeNumber {

	private static int position,c;

	public static void main(String[] args) {
		int position;
		System.out.println("Enter the Number");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		position=sc.nextInt();
		output(position);

	}

	private static void output(int pos) {
		position=pos;
		int i,a=0;
		for(c=2;c<=position;c++) {
		for (i=2;i<=c;i++)
		{
			if((c%i)==0) {
				a=a+1;
			}
		}
		if(a==1) {
			System.out.println(" "+c);
		}
		a=0;
		}
		
	}

}
