package string;

import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int son = scanner.nextInt();
        System.out.print("Harf:");
        char input = scanner.next().charAt(0);
        String res ="";
        for (int i = 0; i < son; i++) {
            res += input;
        }
        System.out.println("Satr:"+res);
    }
}
