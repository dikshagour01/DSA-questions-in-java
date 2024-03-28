public class merge_sort{
    public static void mergeSort(int arr[], int si, int ei){
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        for ( k = 0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]{
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    })
    public static void main(String args[]){
        int arr=[6,5,8,9,1,3];
        mergeSort(arr,0,arr.length);
        printArr(arr);
    }
}