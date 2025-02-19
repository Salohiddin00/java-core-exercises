package ifelse;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Son kiriting:");
        int a= scanner.nextInt();
        System.out.print("Son kiriting:");
        int b= scanner.nextInt();
        int c;
        if(a!=b){
            c=a+b;
        }else{
            c=0;
        }
        System.out.println(a+" : "+b);
        System.out.println("Natija:"+c);
    }
}
