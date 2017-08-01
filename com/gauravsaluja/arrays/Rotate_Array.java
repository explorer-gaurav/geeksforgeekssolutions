package gauravsaluja.com.arrays;

/**
 * Created by Gaurav Saluja on 31/07/2017
 */

/*
 *  Q3: Reverse an array
 *  
 *  http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */

public class Problem3 extends BaseArrayClass {
	public static void reverseArrayLoop(int[] a, int n) {
		int temp = -1;
		for(int i = 0; i < n/2; i++) {
			temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
	}
	
	public static void reverseArrayRecursive(int[] a, int start, int end) {
		int temp = -1;
		if(start >= end) {
			return ;
		}
		temp = a[start];
		a[start] = a[end];
		a[end] = temp;
		reverseArrayRecursive(a, start + 1, end - 1);
	}
}