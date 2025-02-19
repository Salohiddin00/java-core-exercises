package ifelse;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Son kiriting:");
        int a= scanner.nextInt();
        if(a>0){
            a++;
        }
        else if(a==0){
            a=10;
        }
        else{
            a-=2;
        }
        System.out.println("Natija:"+a);
    }
}
