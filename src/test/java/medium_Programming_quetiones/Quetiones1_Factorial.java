package medium_Programming_quetiones;

public class Quetiones1_Factorial {

	public static void main(String[] args) {
		//Write a Java program to find the factorial of a number using recursion.
		
		int number = 30;
		long factorial = multiplynumbers(number);
		System.out.println("Factorial of " + number + " = " + factorial);
		
	}
	public static long multiplynumbers(int number)
	{
		if (number >= 1)
			return number * multiplynumbers(number - 1);
		else
			return 1;
		
	}

}
