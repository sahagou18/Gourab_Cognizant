package lab3;

import java.util.*;

public class StringMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(image(str));

	}

	private static String image(String pStr)
    {
    	//String reverseStr="";
    	//for(int i=pStr.length()-1;i>=0;i--)
    		//reverseStr+=pStr.charAt(i);
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }

}
