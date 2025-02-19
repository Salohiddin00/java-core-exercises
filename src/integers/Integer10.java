package integers;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("A:");
        int A=L1.nextInt();
        int bir=A%10;
        System.out.println("Birliklar:"+bir);
        int on=(A/10)%10;
        System.out.println("O'nliklar"+on);
    }
}
