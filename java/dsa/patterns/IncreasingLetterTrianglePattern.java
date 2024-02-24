package dsa.patterns;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
