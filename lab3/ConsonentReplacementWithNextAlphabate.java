package lab3;

import java.util.*;

public class ConsonentReplacementWithNextAlphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		
        System.out.println("the altered string is:"+replaceConsonanats(str));

	}

	private static String replaceConsonanats(String pStr) {
		// TODO Auto-generated method stub
		String alteredStr="";
		for(int i=0;i<pStr.length();i++)
		{
		if(pStr.charAt(i)=='a' ||pStr.charAt(i)=='A'||
				pStr.charAt(i)=='e'||pStr.charAt(i)=='E'||
				pStr.charAt(i)=='i' ||pStr.charAt(i)=='I'||
				pStr.charAt(i)=='o' ||pStr.charAt(i)=='O'||
				pStr.charAt(i)=='u' ||pStr.charAt(i)=='U' )
		alteredStr+=pStr.charAt(i);
		else
		{
			char ascii=(char)((char) pStr.charAt(i)+1);
			alteredStr+=ascii;
		}
		}
		return alteredStr;
		
	}

}
