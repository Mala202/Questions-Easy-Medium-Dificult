package medium_Programming_quetiones;

import java.util.Arrays;

public class Quetiones5_Highest_number {

	public static void main(String[] args) {
		//Write a Java program to find the second highest number in an array.
		
		int largest = 0;
		int secondlargest = 0;
		
		int [] arr = {80, 45, 92, 51, 100 };
		
		for (int a = 0; a < arr.length; a++) {
			
			if(arr[a] > largest) {
				secondlargest = largest;
				largest = arr[a];
			}
			else if (arr[a] > secondlargest) {
				secondlargest = arr[a];
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The 2nd Largest Number is: " + secondlargest);
		

	}

}
