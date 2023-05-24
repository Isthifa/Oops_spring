import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());
        System.out.println("----------------------");
        System.out.println(q.remove());
        q.offer(30);
        System.out.println("---------------------");
        q.forEach(System.out::println);
    }
    
}
