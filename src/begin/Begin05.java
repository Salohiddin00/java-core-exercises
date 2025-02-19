package begin;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning qirrasi:");
        double a = scanner.nextDouble();
        double V = a*a*a;
        double S = 6*a*a;
        System.out.println("Hajmi V:"+V);
        System.out.println("Yuzi S:"+S);
    }
}
