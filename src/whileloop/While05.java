package whileloop;

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a= scanner.nextInt();
        int sanoq=0;
        while(a%2==0){
            a/=2;
            sanoq++;
        }
        System.out.println(sanoq);
    }
}
