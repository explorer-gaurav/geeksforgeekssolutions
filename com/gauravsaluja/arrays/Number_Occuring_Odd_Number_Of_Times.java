package gauravsaluja.com.arrays;

import java.util.HashMap;

/**
 * Created by Gaurav Saluja on 01/08/2017
 */

/*
 *  Q7: Find the Number Occurring Odd Number of Times
 *  
 *  http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 */

public class Problem7 extends BaseArrayClass {
	public static int getOddOccurenceViaHashmap(int[] a, int size) {
		HashMap<Integer, Boolean> oddNumberMap = new HashMap<>();
		for(int i = 0; i < size; i++) {
			if(oddNumberMap.containsKey(a[i])) {
				if(oddNumberMap.get(a[i])) {
					oddNumberMap.put(a[i], false);
				} else {
					oddNumberMap.put(a[i], true);
				}
			} else {
				oddNumberMap.put(a[i], true);
			}
		}
		
		for(int i = 0; i < size; i++) {
			if(oddNumberMap.get(a[i])) {
				return a[i];
			}
		}
		
		return -1;
	}
	
	public static int getOddOccurenceViaXOR(int[] a, int size) {
		int res = 0;
		
		for(int i = 0; i < size; i++) {
			res = res ^ a[i];
		}
		
		return res;
	}
}