package string;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String :");
        String s1 = scanner.nextLine();
        System.out.print("N :");
        int n = scanner.nextInt();
        String res ="";
        for (int i = 0; i < s1.length()-1; i++) {
            res+=s1.charAt(i);
            for (int j = 0; j < n; j++) {
                res+="*";
            }
        }
        res+=s1.charAt(s1.length()-1);
        System.out.println("Satr:"+res);
    }
}
