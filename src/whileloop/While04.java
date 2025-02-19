package whileloop;

import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a= scanner.nextInt();
        int sanoq=0;
        while(a>=3){
            a/=3;
        }
        if(a==1) {
            System.out.println("Uchning darajasi");
        }
        else {
            System.out.println("Darajasi emas");
        }
    }
}
