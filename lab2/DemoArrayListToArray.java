/**
 * Name:Gourab Saha
 * Description: Array List to Array
 */
package lab2;
import java.util.*;
public class DemoArrayListToArray {

	public static void main(String[] args) {
		 List<Integer> arrayList = new ArrayList<Integer>(); 
	        arrayList.add(10); 
	        arrayList.add(20); 
	        arrayList.add(30); 
	        arrayList.add(40); 
	        
	        Object[] array = arrayList.toArray(); 
	        
	        for (Object obj : array) 
	            System.out.print(obj + " "); 
	}

}
