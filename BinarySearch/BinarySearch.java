package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int [214748647];
		for (int i = 0; i < arr.length; i++) {
			//			int rand = (int)(Math.random() * 10) + 1;
			arr[i] = i;
			//			System.out.print(arr[i] + " , ");
		}

		// checking worst case
		int find = 214748647;

		long timeBefore = System.currentTimeMillis();
		recursiveBinarySearch(arr , find);
		long timeAfter = System.currentTimeMillis();;
		System.out.println("Recursive search time = " + ((timeAfter-timeBefore/1000.0)) + " seconds");


		long timeBefore2 = System.currentTimeMillis();
		iterativeBinarySearch(arr , find);
		long timeAfter2 = System.currentTimeMillis();;
		System.out.println("Iterative search time = " + ((timeAfter2-timeBefore2)/1000.0) + " seconds");

		long timeBefore3 = System.currentTimeMillis();
		linearSearch(arr , find);
		long timeAfter3 = System.currentTimeMillis();;
		System.out.println("Linear search time = " + ((timeAfter3-timeBefore3)/1000.0) + " seconds");

	}

	//*****************************************
	//			RECURSIVE BINARY SEARCH	
	//*****************************************


	public static int recursiveBinarySearch(int array[] , int value) {
		if(value > array[array.length-1] || value < array[0]) {
			return -1;
		}
		return RBS(array , value , 0 , array.length-1);

	}

	public static int RBS(int arr[] , int val , int low , int high) {
		if(low <= high) {
			int middle = (high+low) / 2;
			// we found it
			if(val == arr[middle]) return middle;
			// we search in the left
			else if (val < arr[middle]) return RBS(arr , val , low , middle-1);
			// we search in the right
			else return RBS(arr , val , middle+1 , high);
		}
		return -1;
	}


	//*****************************************
	//		 ITERATIVE BINARY SEARCH	
	//*****************************************	


	public static int iterativeBinarySearch(int array[] , int value) {
		if(value > array[array.length-1] || value < array[0]) return -1;

		int low = 0 ;
		int high = array.length - 1;

		while(low <= high) {
			int middle = (low + high) /2;
			// we found it
			if(array[middle] == value) return middle;
			// we search in the left
			else if (value < array[middle]) high = middle - 1;
			// we search in the right
			else low = middle + 1;

		}

		return -1;
	}


	//*****************************************
	//		 LINEAR BINARY SEARCH	
	//*****************************************	
	public static int linearSearch(int array[] , int value) {

		for (int i = 0; i < array.length-1; i++) {
			if (array[i] == value) return i;
		}
		return -1;	
	}

}

