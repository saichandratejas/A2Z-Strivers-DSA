package dsa.patterns;
import java.util.Scanner;
public class InvertedRightAbgleNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        invertedright(n);
    }
    static void invertedright(int n){
        for(int i=1;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
        }
        
    }
}
