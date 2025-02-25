package string;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if(Character.isDigit(s1.charAt(i))) {
                result.append((s1.charAt(i)));
            }
        }

        System.out.println("Natija: " + result);
    }
}
