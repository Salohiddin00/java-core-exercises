package switchcase;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {
        System.out.print(" a:");
        Scanner scanner = new Scanner(System.in);
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println("1 dm:"+(k/10));
            case 2 -> System.out.println("2 km:"+(k*1000));
            case 3 -> System.out.println("3 m:"+k);
            case 4 -> System.out.println("4 mm:"+(k/1000));
            case 5 -> System.out.println("5 sm:"+(k/100));
            default -> System.out.println(" Xatolik");
        }
    }
}
