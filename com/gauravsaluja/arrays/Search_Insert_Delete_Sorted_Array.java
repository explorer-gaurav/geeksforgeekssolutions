package gauravsaluja.com.arrays;

/**
 * Created by Gaurav Saluja on 31/07/2017
 */

/*
 *  Q2: Search, insert and delete in a sorted array
 *  
 *  http://www.geeksforgeeks.org/search-insert-and-delete-in-a-sorted-array/
 */

public class Problem2 extends BaseArrayClass {
	public static boolean searchElement(int[] a, int low, int high, int key) {
		boolean found = false;
		if(high < low) {
			return found;
		}
		
		int mid = (low + high) / 2;
		if(key == a[mid]) {
			found = true;
			return found;
		}
		
		if(key > a[mid]) {
			return searchElement(a, (mid + 1), high, key);
		} else {
			return searchElement(a, low, (mid - 1), key);
		}
	}
	
	public static int searchElementIndex(int[] a, int low, int high, int key) {
		int index = -1;
		if(high < low) {
			return index;
		}
		
		int mid = (low + high) / 2;
		if(key == a[mid]) {
			return mid;
		}
		
		if(key > a[mid]) {
			return searchElementIndex(a, (mid + 1), high, key);
		} else {
			return searchElementIndex(a, low, (mid - 1), key);
		}
	}

	public static boolean insertElement(int[] a, int key, int size, int n) {
		int index = -1;
		boolean inserted = false;
		if(n >= size) {
			return inserted;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > key) {
				index = i;
				break;
			}
		}
		
		for(int j = n; j >= index; j--) {
			a[j+1] = a[j];
		}
		
		a[index] = key;
		inserted = true;
		return inserted;
	}

	public static boolean deleteElement(int[] a, int key, int size, int n) {
		boolean deleted = false;
		int index = -1;
		if(n <= 0) {
			return deleted;
		}
		
		index = searchElementIndex(a, 0, n, key);
		
		if(index != -1) {
			for(int j = index; j < n - 1; j++) {
				a[j] = a[j+1];
			}
			deleted = true;
			return deleted;
		} else {
			return deleted;
		}
	}
}