package Collections;

import java.util.HashMap;

public class HashMa {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 20);
        map.put(2, 30);
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(1));
    }
    
}
