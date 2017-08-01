package gauravsaluja.com.arrays;

import java.util.HashMap;

/**
 * Created by Gaurav Saluja on 01/08/2017
 */

/*
 *  Q5: Given an array A[] and a number x, check for pair in A[] with sum as x
 *  
 *  http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */

public class Problem5 extends BaseArrayClass { 
	public static boolean findPairWithSumX(int[] a, int size, int sum) {
		int l, r;
		
		quickSort(a, 0, size - 1);
		l = 0;
		r = size - 1;
		
		while(l < r) {
			if(a[l] + a[r] == sum) {
				return true;
			} else if(a[l] + a[r] < sum) {
				l++;
			} else {
				r--;
			}
		}
		
		return false;
	}
	
	public static boolean findPairUsingHashMap(int[] a, int size, int sum) {
		HashMap<Integer, Boolean> finderMap = new HashMap<>();
		
		for(int i = 0; i < size; i++) {
			int temp = sum - a[i];
			
			if(finderMap.get(temp) != null && finderMap.get(temp)) {
				return true;
			} else {
				finderMap.put(a[i], true);
			}
		}
		
		return false;
	}
}