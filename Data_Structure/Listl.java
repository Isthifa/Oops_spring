import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listl {
    public static void main(String[] args) {
        List<String> items=new ArrayList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        System.out.println(items);

        System.out.println("using iterator :");
        Iterator it=items.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("using for loop");
        for(int i=0;i<items.size();i++)
        {
            System.out.println(items.get(i));
        }
        System.out.println("For each ");

        items.forEach(System.out::println);


    }
    
}
