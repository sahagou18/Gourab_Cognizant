/**
 * Name:Gourab Saha
 * Description: Demo Fibonacci
 */
package lab1;
import java.util.*;

@SuppressWarnings("unused")
public class DemoFibonacci {
	
	private static int position;
	private static int b=1;
	private static void output(int pos) {
		position=pos;
		int a=0,sum=0,i;
		
		
		for(i=0;i<position;i++) {
			System.out.println(" "+a);
			sum=a+b;
			a=b;
			b=sum;
			
		}

		
	}

	public static void main(String[] args) {
		int position;
		System.out.println("Enter the position");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		position=sc.nextInt();
		output(position);
	}

}
