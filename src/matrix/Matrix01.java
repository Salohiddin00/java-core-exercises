package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int n = scanner.nextInt();
        System.out.print("M:");
        int m = scanner.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 10*i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
