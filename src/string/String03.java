package string;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("32 <N<= 126  N:");
        int input = scanner.nextInt();
        char oldin,keyin,asli;
        asli =(char) input;
        oldin =(char) (input-1);
        keyin = (char) (input+1);
        System.out.println("Oldin:"+oldin);
        System.out.println("Asli:"+asli);
        System.out.println("Keyin:"+keyin);
    }
}
