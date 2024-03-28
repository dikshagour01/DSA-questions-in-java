public class stack8{
    public static int nextGreater(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                    return;
                }
            }
        }
    }
    
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        nextGreater(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
   
}