import java.util.Stack;

public class Stackd {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.pop();
        System.out.println(s.size());
        System.out.println(s);
    }
    
}
