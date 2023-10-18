package beecrowd;

import java.util.Scanner;

public class AverageTwo {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();

        float med=(float)(a*2.0+b*3.0+c*5.0)/(float)(2+3+5);
        
        System.out.printf("MEDIA = %.1f%n",med);
    }

    
}
