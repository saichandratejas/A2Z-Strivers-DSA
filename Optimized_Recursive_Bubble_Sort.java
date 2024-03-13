public class Optimized_Recursive_Bubble_Sort {
        public static void main(String[] args) {
            int arr[]={10,50,20,40,20};
            int n=arr.length;
            System.out.println("Before Swapping");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
    
            System.out.println();
    
            recursive_sort(arr,n);
            System.out.println("After Swapping");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+ " ");
            }
            
    
        }
        static void recursive_sort(int arr[],int n){
            if(n==1) return;

            int flag=0;
            for(int j=0;j<=n-2;j++){
                if(arr[j]>arr[j+1]){ 
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=1;
                }
            }
            if(flag==0) return;
            recursive_sort(arr, n-1);
        }
    }
    

