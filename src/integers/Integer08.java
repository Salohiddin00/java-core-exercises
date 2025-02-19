package integers;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("A:");
        int A=L1.nextInt();
        int yuz=(A/10)%10;
        int on=A%10;
        int res=on*10+yuz;
        System.out.println("Teskari:"+res);

    }
}
