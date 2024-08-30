package medium_Programming_quetiones;

public class Quetiones2_Palindrome {

	public static void main(String[] args) {
		//Write a Java program to check if a given number is a palindrome or not.
		
		int number = 6738, reversednumber = 0, remainder;
		
		int originalnumber = number;
		while (number != 0) {
			remainder = number % 10;
			reversednumber = reversednumber * 10 + remainder;
			number /= 10;
			
		}
		
		if (originalnumber == reversednumber) {
			System.out.println(originalnumber + " is Palindrome.");
			
		}
		else {
			System.out.println(originalnumber + " is not Palindrome.");
		}

	}

}
