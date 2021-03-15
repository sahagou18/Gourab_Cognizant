/**
 * Name:Gourab Saha
 * Description: Demo Traffic Light
 */


package lab1;
import java.util.*;

@SuppressWarnings("unused")
public class DemoOfTrafficLight {
	
	private static int option;
	

	private static void instruction(int op) {
		option=op;
		switch(option) {
		case 1:
			System.out.println("Stop \n");
			break;
		case 2:
			System.out.println("Ready \n");
			break;
		case 3:
			System.out.println("Go \n");
			break;	
		default:
			System.out.println("Choose the correct option");
		}
		
		
	}

	public static void main(String[] args) {
	int option = 0;
	
	System.out.println("1. Red");
	System.out.println("2. Yellow");
	System.out.println("3. Green");
	System.out.println("Enter an option.");
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	option=sc.nextInt();
	instruction(option);
	

	}

}
