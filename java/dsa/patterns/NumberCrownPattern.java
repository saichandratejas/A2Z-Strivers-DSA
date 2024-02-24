package dsa.patterns;
import java.util.Scanner;

public class NumberCrownPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    crown(n);
}
    static void crown(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println(" ");
    //     }
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=i;k++){
    //             System.out.print(k);
    //         }
    //         System.out.println(" ");
    //     }
    // }
}
}
    
