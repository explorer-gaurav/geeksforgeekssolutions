package gauravsaluja.com.arrays;

import java.util.HashMap;

/**
 * Created by Gaurav Saluja on 01/08/2017
 */

/*
 *  Q6: Majority Element
 *  
 *  http://www.geeksforgeeks.org/majority-element/
 */

public class Problem6 extends BaseArrayClass {
	public static int majorityElementViaHashMap(int[] a, int size) {
		HashMap<Integer, Integer> majorityMap = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			if(majorityMap.get(a[i]) != null) {
				int count = majorityMap.get(a[i]);
				majorityMap.put(a[i], count + 1);

				if((count + 1) >= size/2) {
					return i;
				}
			} else {
				majorityMap.put(a[i], 1);
			}
		}

		return -1;
	}
	
	public static void majorityElementViaPotentialCandidate(int a[], int size) {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);
 
        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println("Majority element is " + cand);
        else
            System.out.println("No Majority Element");
    }

	public static int findCandidate(int a[], int size) {
		int maj_index = 0, count = 1;
		int i;
		for (i = 1; i < size; i++) {
			if (a[maj_index] == a[i])
				count++;
			else
				count--;
			if (count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		return a[maj_index];
	}

	public static boolean isMajority(int a[], int size, int cand) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == cand)
				count++;
		}
		if (count > size / 2) 
			return true;
		else
			return false;
	}
}