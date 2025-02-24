package arrays;

import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("progressiya uzunligi:");
        int n = scanner.nextInt();
        System.out.print("Dastlabki hadi:");
        int a1 = scanner.nextInt();
        System.out.print("maxraji:");
        int d = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(a1*(Math.pow(d,i)));
            System.out.print(arr[i]+" ");
        }

    }
}
