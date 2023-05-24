import java.util.LinkedList;

public class LinkedListl {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("elements");
        list.forEach(System.out::println);
        System.out.println("Add first");
        list.addFirst(30);
        list.forEach(System.out::println);
        System.out.println("Add last ");
        list.addLast(50);
        list.forEach(System.out::println);
        System.out.println("Last element "+list.peekLast());

        System.out.println("First element "+list.peekFirst());

    }
    
}
