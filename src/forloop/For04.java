package forloop;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Konfet narxi:");
        int a = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" kg narxi:"+i*a);
        }
    }
}
