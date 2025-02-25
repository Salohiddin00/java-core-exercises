package string;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("32 <N<= 126  N:");
        int input = scanner.nextInt();
        char ascii =(char) input;
        System.out.println("Char:"+input);
        System.out.println("ASCII:"+ascii);
    }
}
