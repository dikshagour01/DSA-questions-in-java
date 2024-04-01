
// Find Next greater element from an array 

// Time complexity =O(n)

import java.util.*;
public class stack8{
    public static void main(String args[]){
        int arr[]={6,8,1,0,3};
        int nxtgreater[]= new int[arr.length];
        Stack<Integer> s= new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
            s.pop();
        }

        if(s.isEmpty()){
            nxtgreater[i]=-1;
        }
        else{
            nxtgreater[i]=arr[s.peek()];
        }
        s.push(i);

    }


      for(int i=0; i<nxtgreater.length; i++){
            System.out.print(nxtgreater[i]+ " ");
        }
        System.out.println();
    }
}