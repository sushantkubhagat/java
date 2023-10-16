public class Var 
{
    int a=10;
    static int b=20;
    int x;
    static boolean y;
    void meth1()
    {
        int c=20;
        int a=1000;
        int b=2000;

        System.out.println("instance variable a :"+new Var().a);
        System.out.println("instance variable x:"+x);
        System.out.println("______________________");

        System.out.println("static variable b:"+new Var().b);
        System.out.println("static variable b:"+ Var.b);
        System.out.println("Static variable y :"+y);

        System.out.println("____________________________");
        System.out.println("local variable c :"+c);
        System.out.println("local variable a:"+a);
        System.out.println("local variable b :"+b);

    }   
    void meth2()
    {
        System.out.println("inastance variable :"+x);
        System.out.println("static variable:"+y);

    }
    public static void main(String[] args) 
    {
        new Var().meth1();   
    }
}
