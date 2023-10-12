import java.util.*;

public class patternStar{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
     
        // System.out.println("====================");
       
        // for(int i=n; i>=1; i--){
        //     for(int j=i; j>=1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("====================");
    
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // System.out.println("====================");

        // int rows=sc.nextInt();
        // for(int i=1; i<=rows; i++){
        //     for(int j=1; j<=rows-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i ; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        
        System.out.println("====================");
        int na=10;
        // for (int i=na; i>=1; i--){
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        // int counter=1;
        // System.out.println("====================");
        // for(int i=1; i<=na; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(counter+" ");
        //         counter+=1;
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=na;i++){
        //     for(int j=1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print(1);
        //         }
        //         else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=na; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=(2*(na-i)); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=na; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1; j<=(2*(na-i)); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        
            for(int i=1; i<=na; i++){
                for(int j=1; j<=na-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=na; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}