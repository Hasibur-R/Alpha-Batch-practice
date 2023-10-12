package DataStructure;

public class Stocks {

    public static void reverseArr(int arr[]){
        int minBP=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<minBP){
                minBP=arr[i];
            }
            
            if(i==0){
                continue;
            } else if(arr[i]==minBP){
                continue;
            }else{
             profit=arr[i]-minBP;
            if(profit>maxProfit){
                maxProfit=profit;
            }
            }
    }
    System.out.println("Profit: "+maxProfit);
}


    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
    
        reverseArr(arr);
    }
    
}
