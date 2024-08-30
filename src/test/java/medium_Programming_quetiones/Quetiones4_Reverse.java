package medium_Programming_quetiones;

public class Quetiones4_Reverse {

	public static void main(String[] args) {
		//Write a Java program to reverse a given string without using any built-in functions.
		
		String input = "Manana is Cute"; //13
		
		String result = "";
		
		for (int a = input.length() -1; a >= 0; a--) {
			result = result + input.charAt(a);
			
		}
		
		System.out.println(result);
		
		
	}
}
