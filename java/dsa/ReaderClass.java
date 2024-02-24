import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ReaderClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number:");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int x= Integer.parseInt(br.readLine());
        System.out.println("The number is :"+ x);
    }
}
