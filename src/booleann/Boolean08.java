package booleann;

import java.util.Scanner;

public class Boolean08 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("A:");
        int A= a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.print("B:");
        int B= b.nextInt();
        boolean res=(A%2!=0 && B%2!=0);
        System.out.println("Natija:"+res);
    }
}
