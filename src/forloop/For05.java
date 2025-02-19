package forloop;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Konfet narxi:");
        double a = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" kg narxi:"+((i*a)/10));
        }
    }
}
