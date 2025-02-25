package string;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 <=N<= 26  N:");
        int input = scanner.nextInt();
        char belgi;
        for (int i = 0; i < input; i++) {
            belgi = (char) (65+i);
            System.out.print(belgi+" ");
        }
    }
}
