package gauravsaluja.com.arrays;

/**
 * Created by Gaurav Saluja on 31/07/2017
 */

/*
 *  Q4: Leaders in an array
 *  
 *  http://www.geeksforgeeks.org/leaders-in-an-array/
 *  
 *  An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
 *  
 */

public class Problem4 {
	public static void findLeadersTwoLoops(int[] a, int size) {
		for(int i = 0; i < size; i++) {
			int j;
			for(j = i + 1; j < size; j++) {
				if(a[i] <= a[j]) {
					break;
				}
			}
			
			if(j == size) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static void findLeadersSingleLoop(int[] a, int size) {
		int max = 0;
		System.out.println();
		
		for(int i = size - 1; i >=0 ; i--) {
			if(max < a[i]) {
				max = a[i];
				System.out.print(a[i] + " ");
			}
		}
	}
}