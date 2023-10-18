package beecrowd;
import java.util.Scanner;

public class Salary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        float c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextFloat();

        float cc=b*c;
        System.out.println("NUMBER = "+a);
        System.out.printf("SALARY = U$ %.2f%n",cc);

    }
    
}
