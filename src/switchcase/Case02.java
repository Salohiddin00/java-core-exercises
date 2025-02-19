package switchcase;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        System.out.print(" Baho:");
        Scanner scanner = new Scanner(System.in);
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println(" yomon");
            case 2 -> System.out.println(" qoniqarsiz");
            case 3 -> System.out.println(" qoniqarli");
            case 4 -> System.out.println(" yaxshi");
            case 5 -> System.out.println(" alo");
            default -> System.out.println(" Xatolik");
        }
    }
}
