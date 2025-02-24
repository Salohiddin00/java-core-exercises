package matrix;

import java.util.Random;
import java.util.Scanner;

public class Matrix03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("M:");
        int n = scanner.nextInt();
        System.out.print("N:");
        int m = scanner.nextInt();
        int [] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i]= random.nextInt(0,100);
            System.out.println(arr1[i]+" ");
        }
        System.out.println();
        int [][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][i] = arr1[j];
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
