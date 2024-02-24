package dsa.patterns;

import java.util.Scanner;


public class IncreasingNumberPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }

    static void pattern(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count +" ");
                count=count+1;
            }
            System.out.println(" ");
        }
    }
}
