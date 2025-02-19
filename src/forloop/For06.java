package forloop;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Konfet narxi:");
        double a = scanner.nextInt();
        for (int i = 12; i <= 20; i++) {
            System.out.println(i+" kg narxi:"+((i*a)/10));
        }
    }
}
