
package arrays;

import java.util.Scanner;

public class Array017 {
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
        for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
                if(i<(n-1)) {
                    System.out.print(arr[n-i] + " ");
                }
        }
    }
}
