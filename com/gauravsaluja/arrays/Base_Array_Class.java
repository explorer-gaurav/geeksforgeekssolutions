package gauravsaluja.com.arrays;

/**
 * Created by Gaurav Saluja on 31/07/2017
 */

public class BaseArrayClass {
	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(i == a.length - 1) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		
		System.out.println();
	}
	
	public static int partitionIndex(int[] a, int low, int high) {
		int pivot = a[high];
		int i = (low - 1);
		
		for(int j = low; j < high; j++) {	
			if(a[j] <= pivot) {
				i++;
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		
		return i + 1;
	}
	
	public static void quickSort(int[] a, int low, int high) {
		if(low < high) {
			int pi = partitionIndex(a, low, high);
			
			quickSort(a, low, pi - 1);
			quickSort(a, pi + 1, high);
		}
	}
	
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2, int arr1Size, int arr2Size) {
		int i = 0;
		int j = 0;
		int k = 0;
		int totalSize = arr1Size + arr2Size;
		int[] mergedArr = new int[totalSize];
		
		if(arr1Size == 0) {
			mergedArr = arr2;
		}
		if(arr2Size == 0) {
			mergedArr = arr1;
		}
		
		while(k < totalSize) {
			if(i > arr1Size) {
				mergedArr[k] = arr2[j];
				k++;
				j++;
			}
			
			if(j > arr2Size) {
				mergedArr[k] = arr1[i];
				k++;
				i++;
			}
			
			if(i < arr1Size && j < arr2Size && (arr1[i] < arr2[j])) {
				mergedArr[k] = arr1[i];
				k++;
				i++;
			} else {
				mergedArr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		return mergedArr;
	}
}