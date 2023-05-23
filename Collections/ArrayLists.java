package Collections;

import java.util.ArrayList;
import java.util.Iterator;



class ArrayLists
{
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();//store any kind of data
        al.add(10);
        al.forEach(System.out::println);

        ArrayList<Integer> a=new ArrayList<>(); //only integer allowed
        a.add(20);

        Iterator it=a.iterator();
       while(it.hasNext())
       {
        System.out.println(it.next());
       }

       a.add(40);
       a.add(50);
       a.size();
       a.set(1, 10);
       System.out.println(a.contains(10));
    }
}