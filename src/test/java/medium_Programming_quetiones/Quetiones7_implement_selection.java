package medium_Programming_quetiones;

public class Quetiones7_implement_selection {

	public static void main(String[] args) {
		//Write a Java program to implement selection sort algorithm.
		int [] array = {100, 10, 80, 30, 5};
		int min;
		for (int a = 0; a< array.length; a++) {
			
			min = a;
			for (int b = a + 1; b<array.length; b++) {
				if(array[b] <array[min]) {
					min = b;
				}
			}
			if (min != a) {
				final int temp = array[a];
				array[a] = array[min];
				array[min] = temp;
			}
			System.out.println(array[a]);
		}

	}

}
