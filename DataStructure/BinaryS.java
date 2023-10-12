package DataStructure;

public class BinaryS {
    
    public static int binarySearch(int arr[],int key){
        int start=0, end=arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int arr[]={1,6,3,9,69,55,5};
        int key=5;

        System.out.println("Key found on: "+ binarySearch(arr,key));

    }
}
