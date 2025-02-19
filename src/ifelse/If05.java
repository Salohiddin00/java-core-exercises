package ifelse;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Son kiriting:");
        int a= scanner.nextInt();
        System.out.print("Son kiriting:");
        int b= scanner.nextInt();
        System.out.print("Son kiriting:");
        int c= scanner.nextInt();
        int sanoq =0;
        int manfiy=0;
        if(a>0 && b>0 && c>0){
            sanoq=3;
        }
        else if((b>0 && c>0 && a<0)||(b>0 && a>0 && c<0)||(c>0 && a>0 && b<0)){
            sanoq=2;
            manfiy=1;
        }
        else if((c<0 && a<0 && b>0)||(c>0 && a<0 && b<0)||(a>0 && b<0 && c<0)){
            sanoq=1;
            manfiy=2;
        }
        System.out.println("Musbat:"+sanoq);
        System.out.println("Manfiy:"+manfiy);
    }
}
