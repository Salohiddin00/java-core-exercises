package arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.pow(2,i));
            System.out.print(arr[i]+" ");
        }

    }
}
