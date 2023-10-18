package beecrowd;

import java.util.Scanner;

public class AverageONE {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        float med = (float)((a*3.5)+(b*7.5))/(float)(3.5+7.5);
        System.out.printf("MEDIA = %.5f%n",med);

        }
    
}
