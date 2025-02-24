
package arrays;

import java.util.Scanner;

public class Array011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv uzubligi:");
        int n = scanner.nextInt();
        System.out.print("K (1<=K<N):");
        int k=scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i%k==0 && i!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
