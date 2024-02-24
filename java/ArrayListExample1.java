import java.util.*;
class ArrayListExample1{
    public static void main(String args[]){
        ArrayList<String> str=new ArrayList<String>();

        str.add("Dog");
        str.add("Lion");
        str.add("Damini");
        str.add("Tejas");
        Collections.sort(str);

        System.out.println(str.get(2));
        str.set(1,"Jasmin");
        System.out.println(str);
    }
}