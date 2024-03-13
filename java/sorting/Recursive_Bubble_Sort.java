public class Recursive_Bubble_Sort{
    public static void main(String[] args){
        int arr[] = {10, 20,30,40,50};
        int n = arr.length;
        System.out.println("Before Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        recursive_Bubble_Sort(arr, n);

        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void recursive_Bubble_Sort(int arr[], int n){
        if(n==1) return;
        for(int j=0; j<=n-2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursive_Bubble_Sort(arr, n-1);
    }
}