package string;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String:");
        String input = scanner.nextLine();
        char boshi = input.charAt(0);
        char oxiri = input.charAt(input.length()-1);
        System.out.println("Boshi:"+boshi);
        System.out.println("Oxiri:"+oxiri);
    }
}
