package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzubligi:");
        int n = scanner.nextInt();
        System.out.print("A:");
        int a = scanner.nextInt();
        System.out.print("B:");
        int b = scanner.nextInt();
        int [] arr = new int[n];
        arr[0]=a;
        arr[1]=b;
        for (int i = 2; i < n; i++) {
            arr[i]=0;
            for (int j = 0; j < i; j++) {
                arr[i]+=arr[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
