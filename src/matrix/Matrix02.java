package matrix;

import java.util.Scanner;

public class Matrix02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int n = scanner.nextInt();
        System.out.print("M:");
        int m = scanner.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 10*j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
