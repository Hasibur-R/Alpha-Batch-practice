package DataStructure;

public class trapRain {
    public static void trap(int arr[]){
        int count=0;
        int currMax=0;
        int rightMax=Integer.MIN_VALUE;
        int leftMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int cl= arr[i];

            for(int j=i; j<arr.length; j++){
                currMax = arr[j];
                if(rightMax<currMax){
                    rightMax=currMax;
                }
            }

            for(int j=i; j>=0; j--){
                currMax=arr[j];
                if(leftMax<currMax){
                    leftMax=currMax;
                }
            }
            
            int wl= Math.min(rightMax, leftMax);
            int water=wl-cl;
            count+=water;

            rightMax=Integer.MIN_VALUE;
            leftMax=Integer.MIN_VALUE;
        }


        System.out.println("=====================");
        System.out.println(count);
    }

    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};

        trap(arr);
    }
}
