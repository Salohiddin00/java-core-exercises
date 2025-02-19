package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("A:");
        int A=L1.nextInt();
        int yuz=(A/100)%10;
        System.out.println("Yuz:"+yuz);

    }
}
