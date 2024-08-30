package com.easy.programming.easy_programming_questiones;

import java.util.Scanner;

public class Easy_quetion9 {

	public static void main(String[] args) {
		// Write a Java program to convert Fahrenheit to Celsius.
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Input a degree in Fahrenheit: ");
			double fahrenheit = input.nextDouble();
			
			double celsius = ((5 * (fahrenheit - 32.0)) / 9.0 );
			System.out.println(fahrenheit + "degree Fahrenheit is equal to " + celsius + " in celsius");
		}
		

	}

}
