public class Method
{
    public void meth1(int a, int b)
    {
        System.out.println("meth1() called");
        System.out.println("a vlaue: "+a);
        System.out.println("b value: "+b);

    }
    public void meth2(int a, String s)
    {
        System.out.println("meth2() called");
        System.out.println("a vlaue : "+a);
        System.out.println("b value: "+s);
        System.out.println(a+1);

    }
    public static void main(String[] args)
    {
        Method aobj =new Method();
        aobj.meth1(100, 200);
        aobj.meth2(100,"java is awesome");

        
    }

}
