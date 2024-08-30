package medium_Programming_quetiones;

public class Quetiones9_BinarySearch {

	public static int BinarySearch(int numberarray[], int number_to_serch ) {
		int low = 0;
		int high = numberarray.length - 1;
		
		int number_to_search_for = 0;
		
		while (low <= high) {
			int middleindex = (low + high) / 2;
			int middleindexnumber = numberarray[middleindex];
			
			if (number_to_search_for == middleindexnumber) {
				return middleindex;
			}
		}
		
		int middleindexnumber = 0;
		if (number_to_search_for < middleindexnumber) {
			int middleindex = 0;
			high = middleindex;
		}
		if (number_to_search_for > middleindexnumber) {
			int middelindex = 0;
			low = middelindex + 1;
		}
	
	
	return -1;
	}
	
	
	public static void main(String[] args) {
		// Write a Java program to implement binary search algorithm.
		
		int[] arrayofnumbers = {7,6,4,9,32,10};
		
		System.out.println(BinarySearch(arrayofnumbers,  32));

	}

}
