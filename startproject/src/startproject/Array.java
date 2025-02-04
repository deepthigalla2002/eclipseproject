package startproject;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        printCommonElements(arr1, arr2);
    }
    public static void printCommonElements(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && arr1[i] % 2 != 0) {
                    System.out.println(arr1[i]);
                    count++;
                   // break; // Prevent multiple prints of the same element
                }
            }
        }
        if (count == 0) {
            System.out.println("No common odd elements found.");
        }
    }
}
