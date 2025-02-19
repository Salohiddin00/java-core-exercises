package switchcase;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        System.out.print(" a:");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.print(" b:");
        int b= scanner.nextInt();
        System.out.print("Amal:");
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println("Qo'shish:"+(a+b));
            case 2 -> System.out.println("Ayirish:"+(a-b));
            case 3 -> System.out.println("Bo'lish:"+(a/b));
            case 4 -> System.out.println("Ko'paytirish:"+(a*b));
            default -> System.out.println(" Xatolik");
        }
    }
}
