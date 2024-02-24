package dsa.patterns;
import java.util.Scanner;


public class RectangularStarPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }

        static void pattern(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
        
    }
    
