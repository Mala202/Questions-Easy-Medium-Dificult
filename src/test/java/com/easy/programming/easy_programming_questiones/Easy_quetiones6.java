package com.easy.programming.easy_programming_questiones;

public class Easy_quetiones6 {

	public static void main(String[] args) {
		
		int number = 6589, reversednumber = 0, remainder;
		
		int originalnumber = number;
		
		
		while (number != 0) {
			remainder = number % 10;
			reversednumber = reversednumber * 10 + remainder;
			number /= 10;
			
		}
		
		if (originalnumber == reversednumber) {
			System.out.println(originalnumber + "is palindrome. ");
		
	    }
		else {
			System.out.println(originalnumber + "is not palindrome.");
		}
		

	}

}
