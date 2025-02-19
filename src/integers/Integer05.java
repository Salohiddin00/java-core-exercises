package integers;

import java.util.Scanner;

public class Integer05 {
    public static void main(String[] args) {
        Scanner L1=new Scanner(System.in);
        System.out.print("A>B  A:");
        int A=L1.nextInt();
        Scanner b1=new Scanner(System.in);
        System.out.print("A>B  B:");
        int B=b1.nextInt();
        int N=A/B;
        System.out.println("Nechta:"+N);
        int Q=A%B;
        System.out.println("Qoldiq:"+Q);

    }
}
