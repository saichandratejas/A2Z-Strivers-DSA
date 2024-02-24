import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Grapes");
        list.add("banana");
        list.add("Apple");
        list.add("Pineapple");

        System.out.println(list);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s : list)
            System.out.println(s);
        
    }
}