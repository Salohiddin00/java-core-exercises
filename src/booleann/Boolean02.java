package booleann;

import java.util.Scanner;

public class Boolean02 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("A:");
        int A= a.nextInt();
        boolean res=(A%2!=0);
        System.out.println("Natija:"+res);
    }
}
