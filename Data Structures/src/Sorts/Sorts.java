package Sorts;

public class Sorts {

	public static void main(String[] args) {
		int size = 100000,  numTo=10000;
		int [] array;
		// bubble sort
		array = getIntArray(size,numTo);
		long  timeBefore = System.currentTimeMillis();
		bubbleSort(array);
		long timeAfter = System.currentTimeMillis();
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
		System.out.println("Insertion Sort time = " + ((timeAfter-timeBefore)/1000.0) + " seconds");		}


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


}
