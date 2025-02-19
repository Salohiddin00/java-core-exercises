package whileloop;

import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a= scanner.nextInt();
        int k=0;
        while((k+1)*(k+1)<=a){
            k++;
        }
        System.out.println(k);
    }
}
