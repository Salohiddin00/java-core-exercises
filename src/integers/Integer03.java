package integers;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("bayt:");
        int bayt=L1.nextInt();
        int M=bayt/1024;
        System.out.println("Kb:"+M);

    }
}
