package arrays;

import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzubligi:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] arr1 = new int[n];
        int temp=n-1;
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[temp];
            System.out.print(arr1[i]+" ");
            temp--;
        }
    }
}
