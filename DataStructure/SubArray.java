package DataStructure;

public class SubArray {
    public static void subArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print("["+arr[i]+"]"+ " ");
            System.out.print(",");
            for(int j=i+1; j<arr.length; j++){
                System.out.print("["+arr[i]+","+arr[j]+"]"+ " ");
                System.out.print(",");
            }
            System.out.println();
        }
    }


    public static void subArr2(int arr[]){
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("[");
               for(int k=i; k<=j; k++){
                System.out.print(" ");
                System.out.print(arr[k]);
                System.out.print(" ");
               }
                System.out.print("],");
            }
            System.out.println();
        }
    }

    //BruteForce Max Sum of Sub array
    public static void subArr3(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
               currSum=0;
               for(int k=i; k<=j; k++){
                currSum+=arr[k];
               }
               if(currSum>maxSum){
                maxSum=currSum;
               }
            }
           
        }
        System.out.println("Max sub array:"+maxSum);
    }
        //Prefix Subarray Sum
    public static void subArr4(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;       
        int pref[]= new int[arr.length];
        
        pref[0]=arr[0];
        for(int i=1; i<pref.length; i++){
            pref[i]=pref[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum= start==0? pref[end]: pref[end]-pref[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sub array:"+maxSum);
           
    }


    //Kadanes algorithm
    public static void kadanesSUM(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println("Max by kadans algo: "+ maxSum);
    } 
    

    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int arr2[]={-2,-3,4,-1,-2,1,5,-3};
        subArr(arr);
        subArr2(arr);
        subArr3(arr);
        subArr4(arr);
        kadanesSUM(arr2);
    }
    
}
