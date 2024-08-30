package com.easy.programming.easy_programming_questiones;

import java.util.Random;

public class Easy_quetion10 {

	public static void main(String[] args) {
		// Write a Java program to generate a random number between 1 and 100.
		
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(1200);
		int rand_int2 = rand.nextInt(1089);

		System.out.println("Random Integers: "+rand_int1);
		System.out.println("Random Integers: "+rand_int2);
		
		double rand_dub1 = rand.nextDouble();
		double rand_dub2 = rand.nextDouble();
		
		System.out.println("Random Double: "+rand_dub1);
		System.out.println("Random Double: "+rand_dub2);
	}

}
