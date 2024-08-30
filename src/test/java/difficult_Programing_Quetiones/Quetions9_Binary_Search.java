package difficult_Programing_Quetiones;

public class Quetions9_Binary_Search {
		//Write a program to implement a binary search algorithm for a rotated sorted array in Java.
	    public static int search(int[] nums, int target)
	    {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] == target) {
	                return mid;
	            }
	            if (nums[mid] >= nums[left]) {
	                if (target >= nums[left]
	                    && target < nums[mid]) {
	                    right = mid - 1;
	                }
	                else {
	                    left = mid + 1;
	                }
	            }
	            else {
	                if (target > nums[mid]
	                    && target <= nums[right]) {
	                    left = mid + 1;
	                }
	                else {
	                    right = mid - 1;
	                }
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args)
	    {
	        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
	        int target1 = 0;
	        int result1 = search(arr1, target1);
	        System.out.println(result1);

	        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
	        int target2 = 3;
	        int result2 = search(arr2, target2);
	        System.out.println(result2);
	    }
	}

	

