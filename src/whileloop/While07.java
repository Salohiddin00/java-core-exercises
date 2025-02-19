package whileloop;

import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a= scanner.nextInt();
        int k=1;
        while(k*k<=a){
            k++;
        }
        System.out.println(k);
    }
}
