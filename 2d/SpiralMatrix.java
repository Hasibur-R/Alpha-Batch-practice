import java.util.Scanner;

package 2d;

public class SpiralMatrix {
    public static void inputMatrix(int spiMax[][]){
        Scanner sc2= new Scanner(System.in);

        System.out.println("Enter values: ");
        for(int i=0; i<spiMax.length; i++){
            for(int j=0; j<spiMax[0].length; j++){
                spiMax[i][j] = sc2.nextInt();       
            }
        }

        
    }
    
    public static void spiralOut(){

    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int c,r;
        System.out.println("Enter the no of rows: ");
        r=sc.nextInt();
        System.out.println("Enter the no of colums: ");
        c=sc.nextInt();

        int spiMAT[][]= new int[r][c];
        
        inputMatrix(spiMAT);
    }
}
