package string;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Char:");
        char input = scanner.next().charAt(0);
        int ascii = input;
        System.out.println("Char:"+input);
        System.out.println("ASCII:"+ascii);
    }
}
