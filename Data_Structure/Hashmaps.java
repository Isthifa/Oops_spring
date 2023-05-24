import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<Integer,person> map=new HashMap<>();
        map.put(1,new person("user1"));
        map.put(2,new person("user2"));
        map.put(3,new person("user3"));
        map.entrySet()
        .forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("user1"));
        System.out.println(map.keySet());
        System.out.println(map.get(1));

        map.forEach((key,person)->{
            System.out.println(key+" "+person);

        });

        
    
    }
    record person(String name){}
    
}
