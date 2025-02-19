package ifelse;

import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Son kiriting:");
        int a= scanner.nextInt();
        System.out.print("Son kiriting:");
        int b= scanner.nextInt();
        int c;
        if(a>b){
            c=a;
            a=b;
            b=c;
        }
        System.out.println("Natija:"+b+" , "+a);
    }
}
