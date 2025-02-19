package booleann;

import java.util.Scanner;

public class Boolean05 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("A:");
        int A= a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.print("B:");
        int B= b.nextInt();
        boolean res=(A>=0 && B<-2);
        System.out.println("Natija:"+res);
    }
}
