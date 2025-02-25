package string;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        String res ="";
        for (int i = 0; i < s1.length(); i++) {
            res+=s1.charAt(s1.length()-1-i);
        }
        System.out.println("Satr:"+res);
    }
}
