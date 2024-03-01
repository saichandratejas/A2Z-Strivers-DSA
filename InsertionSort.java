public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,28,79,5};
        int n=arr.length;
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionsort(arr,n);
    }
    static void insertionsort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            
        }
        System.err.println("After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
