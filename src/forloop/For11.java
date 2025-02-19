package forloop;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        double sum=0;
        for (int i = 0; i < a; i++) {
            sum+=((a+i)*(a+i));
        }
        System.out.println(sum);
    }
}
