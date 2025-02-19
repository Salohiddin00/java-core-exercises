package begin;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius:");
        double R= scanner.nextDouble();
        double L=2*3.14*R;
        double S=3.14*R*R;
        System.out.println("Aylana L:"+L);
        System.out.println("Aylana S:"+S);
    }
}
