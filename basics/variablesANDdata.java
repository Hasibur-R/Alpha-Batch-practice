import java.util.Scanner;

public class variablesANDdata {
    public static void main(String args[]){
        float a,b,c;
        a=5f;
        b=10f;
        c=20f;
        float avg=((a+b+c)/3);
        System.out.println("Average of 3 number: "+avg);

        int sqa= (int)(a*a);
        System.out.println("Area of a Square: "+sqa);
        
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        
        float sum=(pencil+pen+eraser);
        float withTax= (sum+(sum*(18f/100f)));
        System.out.println("Total price with 18% tax: "+withTax);
    }
}
