package String;
import java.util.*;

public class ShortestPath {

    public static float shortDest(String a){
        int x=0,y=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='w' || a.charAt(i)=='W'){
                x-=1;
            }
            else if(a.charAt(i)=='e' || a.charAt(i)=='E'){
                x+=1;
            }
            else if(a.charAt(i)=='n' || a.charAt(i)=='N'){
                y+=1;
            }
            else if(a.charAt(i)=='s' || a.charAt(i)=='S'){
                y-=1;
            }
        }
        System.out.println(x+" "+y);
        float bb= (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(bb);
        return bb;
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter the destination path: ");
        String a = sc.next();

        shortDest(a);
    }
    
}
