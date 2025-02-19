package begin;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner1.nextDouble();
        System.out.print("Enter b:");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();
        double S = a*b;
        double P = 2*(a+b);
        System.out.println("Yuzi S:" + S);
        System.out.println("Perimetr P:" + P);
    }
}
