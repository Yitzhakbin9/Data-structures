package Sorts;

public class Sorts {

	public static void main(String[] args) {
		int size = 100000,  numTo=10000;


		int randomArray[] = getIntArray(size,numTo);

		// Increasing array
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		// Decreasing array
		int j=0;
		int[] arr2 = new int[array.length];
		for (int i = array.length-1; i >= 0; i--) {
			arr2[j] = i;
			j++;

		}

		System.out.println("************   Increasing array   ************");
		compareSorts(array, size, numTo);

		System.out.println("************   Decreasing array   ************");
		compareSorts(arr2, size, numTo);

		System.out.println("************   Random array   ************");
		compareSorts(randomArray, size, numTo);	
	}


	public static void compareSorts(int array[] , int size , int numTo) {
		long  timeBefore = System.currentTimeMillis();
		long timeAfter = System.currentTimeMillis();
		timeBefore = System.currentTimeMillis();
		bubbleSort(array);
		timeAfter = System.currentTimeMillis();
		System.out.println("Bubble Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");		

		//  selection sort
		array = getIntArray(size,numTo);
		timeBefore = System.currentTimeMillis();
		selectionSort(array);
		timeAfter = System.currentTimeMillis();
		System.out.println("Selection Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");

		// insertion sort
		array = getIntArray(size,numTo);
		timeBefore = System.currentTimeMillis();
		insertionSort(array);
		timeAfter = System.currentTimeMillis();;
		System.out.println("Insertion Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");		

		// Quick sort
		array = getIntArray(size,numTo);
		timeBefore = System.currentTimeMillis();
		quickSortArr(array);
		timeAfter = System.currentTimeMillis();
		System.out.println("Quick Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");	

		// Merge sort
		array = getIntArray(size,numTo);
		timeBefore = System.currentTimeMillis();
		mergeSort(array);
		timeAfter = System.currentTimeMillis();
		System.out.println("Merge Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");
	}





	//*****************************
	//  	Insertion Sort 
	//*****************************

	public static void insertionSort(int[] arr){
		for (int i=1; i <arr.length; i++){
			int j = i;
			while (j>0 && arr[j]<arr[j-1]){
				if(arr[j-1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				j = j-1;
			}			
		}		
	}

	//*****************************
	//        Bubble Sort 
	//*****************************


	public static void bubbleSort(int[] arr){
		boolean flag = true;
		for (int i=0; flag && i <arr.length; i++){
			flag = false;
			for (int j=0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	} 

	public static int arrayMinIndex(int from, int arr[]){
		//		 find the index of array's smallest number – begin with from number
		int index=from;
		for (int i=from;i<arr.length; i++){
			if (arr[i] < arr[index])
				index = i;
		}
		return index;
	}


	//*****************************
	//  	Selection Sort 
	//*****************************

	public static void selectionSort(int[] arr){
		int i, smallestIndex;
		for (i=0; i<arr.length; i++){
			smallestIndex = arrayMinIndex(i, arr);
			swap(arr, i, smallestIndex);
		}
	}
	//Swap
	public static void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


	public static int[] getIntArray(int size, int toNum){
		int[] iArr = new int[size];
		for(int i=0; i<size;i++){
			iArr[i] = (int)(toNum*Math.random());
		}
		return iArr;
	}


	// From GeeksForGeeks
	//*****************************
	//  	Quick Sort 
	//*****************************

	static int partition(int[] arr, int low, int high)
	{

		int pivot = arr[high];
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}



	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}


	public static void quickSortArr(int [] arr) {
		quickSort(arr , 0 , arr.length-1);
	}



	// From GeeksForGeeks
	//*****************************
	//  	Merge Sort 
	//*****************************


	static void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static // Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void mergeSort(int arr[]) {
		sort(arr , 0 , arr.length-1);
	}
}
