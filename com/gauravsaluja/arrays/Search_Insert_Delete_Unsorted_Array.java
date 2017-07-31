package gauravsaluja.com.arrays;

/**
 * Created by Gaurav Saluja on 31/07/2017
 */

/*
 *  Q1: Search, insert at end, insert at beginning and delete in an unsorted array
 *  
 *  http://www.geeksforgeeks.org/search-insert-and-delete-in-an-unsorted-array/
 */

public class Problem1 extends BaseArrayClass {
	public static boolean searchElement(int[] a, int key) {
		boolean found = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				found = true;
			}
		}
		
		return found;
	}

	public static boolean insertElementAtBeginning(int[] a, int key, int size, int n) {
		boolean inserted = false;
	
		if(n >= size) {
			return inserted;
		}
		
		int i = 0;
		for(i = n; i >= 0; i--) {
			a[i+1] = a[i];
		}
		a[i+1] = key;
		inserted = true;
		return inserted;
	}
	
	public static boolean insertElementAtEnd(int[] a, int key, int size, int n) {
		boolean inserted = false;
		
		if(n >= size) {
			return inserted;
		}
		
		a[n] = key;
		inserted = true;
		return inserted;
	}

	public static boolean deleteElement(int[] a, int key) {
		int index = -1;
		boolean deleted = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return deleted;
		}
		
		for(int i = index; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		
		deleted = true;
		return deleted;
	}
}