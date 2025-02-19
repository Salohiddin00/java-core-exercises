package whileloop;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A:");
        int a= scanner.nextInt();
        System.out.println("B:");
        int b= scanner.nextInt();
        int sanoq=0;
        while(a > b){
            a-=b;
            sanoq++;
        }
        System.out.println("Natija:"+sanoq);
    }
}
