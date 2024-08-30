package medium_Programming_quetiones;

public class Quetiones3_String_Palindrome {

	public static void main(String[] args) {
		//Write a Java program to check if a given string is a palindrome or not. 
		
		String pali = "Radar" , reversepali = "";
		int palilength = pali.length();
		
		for (int a = (palilength - 1); a >= 0; --a) {
			reversepali =reversepali + pali.length();
			
		}
		if (pali.toLowerCase().equals(reversepali.toLowerCase())) {
			System.out.println(pali + " is a Palindrome String.");
		}
		else {
			System.out.println(pali + " is not Palindrome String.");
		}

	}

}
