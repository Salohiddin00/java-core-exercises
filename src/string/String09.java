package string;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1:");
        String s1 = scanner.nextLine();
        System.out.print("String 2:");
        String s2 = scanner.nextLine();
        String res =s1+" "+s2;
        System.out.println("Satr:"+res);
    }
}
