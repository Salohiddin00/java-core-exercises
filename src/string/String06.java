package string;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Char:");
        char input = scanner.next().charAt(0);
        if(Character.isDigit(input)){
            System.out.println("Raqam");
        }
        else if(Character.isLetter(input)){
            System.out.println("Lotin");
        }
        else{
            System.out.println(0);
        }
    }
}
