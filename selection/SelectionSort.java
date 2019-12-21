package selection;
import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr){
		
        for (int i = 0; i < arr.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallNumber;  
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
        
        selectionSort(elements);
        
        System.out.println();
        System.out.println("Array after sorting:");
        for (int i = 0; i < length; i++) {
            System.out.print(String.valueOf(elements[i]) + " ");
        }
        
        sc.close();
    }

}
