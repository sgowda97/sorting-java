package insertion;
import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int array[]) {  
		int n = array.length;  
		for (int j = 1; j < n; j++) {  
			int key = array[j];  
			int i = j-1;  
			while ( (i > -1) && ( array [i] > key ) ) {  
				array [i+1] = array [i];  
				i--;  
			}  
			array[i+1] = key;  
		}  
	}

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the elements:");
		final int length = sc.nextInt();
		final int[] elements = new int[length];

		System.out.println("Enter the elements:");
		for (int i = 0; i < length; i++) {
			elements[i] = sc.nextInt();
		}

		System.out.println("Array before sorting:");
		for (int i = 0; i < length; i++) {
			System.out.print(String.valueOf(elements[i]) + " ");
		}

		insertionSort(elements);

		System.out.println();
		System.out.println("Array after sorting:");
		for (int i = 0; i < length; i++) {
			System.out.print(String.valueOf(elements[i]) + " ");
		}

		sc.close();
	}

}
