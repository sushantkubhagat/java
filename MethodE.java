public class MethodE 
{
    void meth1(int a, int b)
    {
        MethodE obj=new MethodE();
        System.out.println(a-1);
        System.out.println(b);
        obj.meth4(10,2,2);
    }   
    void meth2(int x)
    {
        MethodE obj=new MethodE();
        System.out.println(x);
        obj.meth1(10, 10);
        System.out.println(x+9);
    }
    void meth3(int x, int y)
    {
        System.out.println(x*y);
        MethodE obj=new MethodE();
        System.out.println(y);
        obj.meth2(1);

    }
    void meth4(int a,int b, int c)
    {
        System.out.println(a+b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a*b);

    }
    public static void main(String[] args)
    {
        MethodE obj=new MethodE();
        obj.meth3(5,2);
        
    }

}
