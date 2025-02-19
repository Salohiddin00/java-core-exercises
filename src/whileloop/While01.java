package whileloop;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A:");
        int a= scanner.nextInt();
        System.out.println("B:");
        int b= scanner.nextInt();
        while(a > b){
            a-=b;
        }
        System.out.println("Natija:"+a);
    }
}
