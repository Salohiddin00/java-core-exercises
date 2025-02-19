package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("A:");
        int A=L1.nextInt();
        int yuz=(A/10)%10;
        System.out.println("O'nlik:"+yuz);
        int on=A%10;
        System.out.println("Birlik:"+on);
        int sum=on+yuz;
        System.out.println("Raqamlar yig'indisi"+sum);

    }
}
