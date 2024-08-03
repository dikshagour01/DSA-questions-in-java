import java.util.*;
public class Kadanes{
    public static void KadanesAlgo(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.print("max subarray sum : "+maxSum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        KadanesAlgo(arr);
    }
}