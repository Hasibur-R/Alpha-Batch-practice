package beecrowd;
import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double R,A;

        R = sc.nextDouble();
        A = ((R*R)*3.14159);
        System.out.printf("A=%.4f%n",A);
    }
}
