package beecrowd;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a;
        float b,c;

        a=sc.next();
        b=sc.nextFloat();
        c=sc.nextFloat();

        double cc= (double)((c*15)/100.0);
        double bb=b+cc;

        System.out.printf("TOTAL = R$ %.2f%n",bb);
    }
}
