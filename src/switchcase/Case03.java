package switchcase;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        System.out.print(" Oy:");
        Scanner scanner = new Scanner(System.in);
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println(" qish");
            case 2 -> System.out.println(" qish");
            case 3 -> System.out.println(" bahor");
            case 4 -> System.out.println(" bahor");
            case 5 -> System.out.println(" bahor");
            case 6 -> System.out.println(" yoz");
            case 7 -> System.out.println(" yoz");
            case 8 -> System.out.println(" yoz");
            case 9 -> System.out.println(" kuz");
            case 10 -> System.out.println(" kuz");
            case 11 -> System.out.println(" kuz");
            case 12 -> System.out.println(" qish");
            default -> System.out.println(" Xatolik");
        }
    }
}
