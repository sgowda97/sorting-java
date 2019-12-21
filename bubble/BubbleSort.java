package bubble;
import java.util.Scanner;

public class BubbleSort
{
    static void bubbleSort(final int[] arr) {
        final int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n - i; ++j) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the elements:");
        final int length = sc.nextInt();
        final int[] elements = new int[length];
        System.out.println("Enter the elements:");
        for (int i = 0; i < length; ++i) {
            elements[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for (int i = 0; i < length; ++i) {
            System.out.print(String.valueOf(elements[i]) + " ");
        }
        bubbleSort(elements);
        System.out.println();
        System.out.println("Array after sorting:");
        for (int i = 0; i < length; ++i) {
            System.out.print(String.valueOf(elements[i]) + " ");
        }
        sc.close();
    }
}
