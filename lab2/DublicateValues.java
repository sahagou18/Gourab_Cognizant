/**
 * Name:Gourab Saha
 * Description: Demo to find the duplicate values.
 */
package lab2;
import java.util.*;

public class DublicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			//to take user input of length of an array
			System.out.print("Enter the number of items:");
			final int NUM_ITEMS=sc.nextInt();
			
			//to take user input of elements of array
			System.out.print("Enter the elements of array(seperated by space)");
			int [] arr=new int[NUM_ITEMS];
			for(int i=0;i<arr.length;i++)
				arr[i]=sc.nextInt();
			
			//to display duplicate values in an array
			int count=0;
			String output="";
			System.out.println("Duplicate elements in the given array");
			for(int i=0;i<arr.length;i++)
			{
				count=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						break;
					}
				}
					if(count==1)
					{
						if(output.contains(Integer.toString(arr[i]))==false)
							output+=Integer.toString(arr[i])+",";
							
					}
						
			}
			System.out.println(output.substring(0,output.length()-1));
		}

	}


