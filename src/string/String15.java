package string;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        int sanoq=0;
        for (int i = 0; i < s1.length(); i++) {
            if(97<=s1.charAt(i) && 122>=s1.charAt(i)){
                sanoq++;
            }
        }
        System.out.println("Natija:"+sanoq);
    }
}
