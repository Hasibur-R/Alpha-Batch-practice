package beecrowd;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,a,b;
        float s,sum=0, d;

        for(i=0; i<2; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            d=sc.nextFloat();

            s=(float)(b*d);
            sum+=s;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",sum);

    }
    
}
