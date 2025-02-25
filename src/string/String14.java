package string;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        int sanoq=0;
        for (int i = 0; i < s1.length(); i++) {
            if(65<=s1.charAt(i) && 90>=s1.charAt(i)){
                sanoq++;
            }
        }
        System.out.println("Natija:"+sanoq);
    }
}
