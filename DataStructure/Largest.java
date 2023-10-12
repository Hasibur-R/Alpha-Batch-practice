package DataStructure;

public class Largest {
    
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest value: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int arr[]={1 , 2, 6, 3, 9};
        
        int a=largest(arr);
        System.out.println("largest value: "+a);
    }
}
