import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s.size());
        System.out.println(s.add(10));
        s.forEach(System.out::println);
        s.remove(20);
        System.out.println(s.contains(30));
    }
    
}
