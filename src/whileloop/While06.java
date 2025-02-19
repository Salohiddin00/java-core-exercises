package whileloop;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a= scanner.nextInt();
        long sanoq=1;
        int i=1;
        while(i<=a){
            sanoq*=i;
            i++;
        }
        long sum=1;
        int j=1;
        while (j<=sanoq){
            sum*=j;
            j++;
        }
        System.out.println(sum);
    }
}
