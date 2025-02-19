package ifelse;

import java.util.Scanner;

public class If07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Son kiriting:");
        int a= scanner.nextInt();
        System.out.print("Son kiriting:");
        int b= scanner.nextInt();
        if(a<b){
            System.out.println("Natija:"+a);
        }else{
            System.out.println("Natija:"+b);
        }
    }
}
