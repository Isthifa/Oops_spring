package inheritance.multilevel;

public class A {
    int a,b,c;
    public void add()
    {
        a=10;b=20;
        c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        a=10;b=20;
        c=b-a;
        System.out.println(c);
    }
}
