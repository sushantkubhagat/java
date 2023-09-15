public class MethodC
{
    void meth1(int a, int b, int c)
    {
        System.out.println(a);
        System.out.println("a :"+a);
        System.out.println(a+b);
        new MethodC().meth2();

    }
    void meth2()
    {
        System.out.println("meth2() calling");

    }
    public static void main(String[] args) 
    {
        MethodC obj=new MethodC();
        obj.meth1(10, 20, 30);
    }
}   