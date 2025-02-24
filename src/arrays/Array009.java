package arrays;

import java.util.Scanner;

public class Array009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzubligi:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int sanoq=0;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                sanoq++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(sanoq);
    }
}
