public class Optimized_Recursive_Bubble_Sort{
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        System.out.println("Before Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        optimized_Recursive_Bubble_Sort(arr, n);

        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void optimized_Recursive_Bubble_Sort(int arr[], int n){
        if(n==1) return;//5==1

        int flag = 0;
        for(int j=0; j<=n-2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = 1;
            }
        }

        if(flag == 0) return;
        optimized_Recursive_Bubble_Sort(arr, n-1);
    }
}