package booleann;

import java.util.Scanner;

public class Boolean06 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("A:");
        int A= a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.print("B:");
        int B= b.nextInt();
        Scanner c=new Scanner(System.in);
        System.out.print("C:");
        int C= c.nextInt();
        boolean res=(A<=B && B<=C);
        System.out.println("Natija:"+res);
    }
}
