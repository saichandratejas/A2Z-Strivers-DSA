package dsa.patterns; //* */

import java.util.Scanner;

public class AplhaRampPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    pattern(n);
    }
    static void pattern(int n){
        for(int i=0;i<=n;i++){
            char ch = (char)('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
