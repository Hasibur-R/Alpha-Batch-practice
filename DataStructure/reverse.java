package DataStructure;

public class reverse {

    public static void reverseArr(int arr[]){
        int start=0, end=(arr.length-1);

        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,5,8,10,69};
    
        reverseArr(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
