
public class StringAssignment1 {


	public static void main(String[] args) {
		String str = "Hello My Dear Friends";
		String[] words = str.split("\\s+");
		String outputString = "";
        
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         System.out.println("The Reversed string is:" +outputString);

	}

}
