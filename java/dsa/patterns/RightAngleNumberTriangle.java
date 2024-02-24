package dsa.patterns;
import java.util.Scanner;

public class RightAngleNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        triangle(n);
    }
    static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
