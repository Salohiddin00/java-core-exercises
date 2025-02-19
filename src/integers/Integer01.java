package integers;

import java.util.Scanner;

public class Integer01 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("L:");
        int L=(int) L1.nextDouble();
        int M=L/100;
        System.out.println("M:"+M);
    }
}
