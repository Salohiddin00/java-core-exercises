package switchcase;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {
        System.out.print(" a:");
        Scanner scanner = new Scanner(System.in);
        int k= scanner.nextInt();
        switch (k){
            case 1 -> System.out.println("1 kg:"+k);
            case 2 -> System.out.println("2 mg:"+(k/(1000*1000)));
            case 3 -> System.out.println("3 g:"+(k/1000));
            case 4 -> System.out.println("4 tonna:"+(k*1000));
            case 5 -> System.out.println("5 sentner:"+(k*100));
            default -> System.out.println(" Xatolik");
        }
    }
}
