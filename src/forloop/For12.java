package forloop;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        double sum=1;
        for (int i = 11; i < a; i++) {
            sum*=(i/10.0);
        }
        System.out.println(sum);
    }
}
