package switchcase;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        System.out.print(" Oy:");
        Scanner scanner = new Scanner(System.in);
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println("Yanvar:"+31);
            case 2 -> System.out.println(" Fevral:"+28);
            case 3 -> System.out.println(" Mart:"+31);
            case 4 -> System.out.println(" Aprel:"+30);
            case 5 -> System.out.println(" May:"+31);
            case 6 -> System.out.println(" Iyun:"+30);
            case 7 -> System.out.println(" Iyul:"+30);
            case 8 -> System.out.println(" Avgust:"+31);
            case 9 -> System.out.println(" Sentyabr:"+30);
            case 10 -> System.out.println(" Oktyabr:"+31);
            case 11 -> System.out.println(" Noyabr:"+30);
            case 12 -> System.out.println(" Dekabr:"+31);
            default -> System.out.println(" Xatolik");
        }
    }
}
