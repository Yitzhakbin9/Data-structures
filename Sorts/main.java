package Sorts;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n*****************\n");
		
		int j=0;
		int[] arr2 = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			arr2[j] = i;
			j++;

		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}
}
