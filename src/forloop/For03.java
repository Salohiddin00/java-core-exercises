package forloop;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        System.out.print("b:");
        int b = scanner.nextInt();
        int sum=b-a+1;
        for (int i = b; i >= a; i--) {
            System.out.print(i+" ");
        }
        System.out.println(sum);
    }
}
