package forloop;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        double sum=0;
        for (int i = 1; i <= a; i++) {
            sum+=(1.0/i);
        }
        System.out.println(sum);
    }
}
