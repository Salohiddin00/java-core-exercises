package begin;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print(" a :");
        double a= scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print(" b :");
        double b= scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print(" c :");
        double c= scanner3.nextDouble();
        double V =a*b*c;
        double S = 2*(a*b+b*c+a*c);
        System.out.println("Hajm :"+V);
        System.out.println("Yuz :"+S);
    }
}
