public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = { 1,5, 8,12, 10};
        int n=arr.length;
        System.out.println("Before Selection:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        selection_sort(arr,n);
        
    }
    static void selection_sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int minimum=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            int temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println("After Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}