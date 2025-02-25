package string;

import java.util.Scanner;

public class String16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (65 <= ch && ch <= 90) {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }

        System.out.println("Natija: " + result);
    }
}
