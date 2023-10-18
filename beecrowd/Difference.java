package beecrowd;

import java.util.Scanner;

public class Difference {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        int dif=(a*b-c*d);
        System.out.println("DIFERENCA = "+dif);
    }
    
}
