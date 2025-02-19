package begin;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.print("a :");
        double a= a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print("b :");
        double b = b1.nextDouble();
        double ortageo = Math.pow((a*b),(1.0/2));
        System.out.println("O'rta geometrik:"+ortageo);
    }
}
