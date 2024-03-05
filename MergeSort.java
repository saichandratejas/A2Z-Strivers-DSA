import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={2,18,10,5,87};
        int n=arr.length;
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergesort(arr,0,n-1);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergesort(int arr[],int low,int high){
        if(low<high){
            int mid=(low + high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }
    static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temparr=new ArrayList<Integer>();
        int left=low ;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temparr.add(arr[left]);
                left++;

            }
            else{
                temparr.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temparr.add(arr[left]);
            left++;
        }
        while(right<=high){
            temparr.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temparr.get(i-low);
        }
        
    }
}
