public class operator4 
{
    void meth1(int a,int b, int c)
    {
        c=a+b;
        System.out.println("addition"+c);
        new operator4().meth2(100,99);
    }
    void meth2(int a, int b)
    {
        System.out.println("substraction"+ (a-b));
    }
    operator4()
    {
        System.out.println("division"+(10/2));
    }
    operator4(int a)
    {
        System.out.println("multiplication"+(a*5));
    }
    public static void main(String[] args) 
    {
        new operator4(10).meth1(10, 900, 0);
    }

}
