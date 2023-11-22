public class TCImplicit 
{
    void implicit()
    {
        byte b=10;
        System.out.println("byte value is :"+b);
        short s=b;
        System.out.println("short value is :"+s);
        s++;
        int i=s++;
        System.out.println("int:"+i);
        System.out.println("short"+s);
        long l=i;
        System.out.println("long "+(--l));
        float f=l;
        System.out.println("float "+(f+b));
        double d=(--f);
        System.out.println("double"+d);
        show();
        if(!(d==f))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
    public static void main(String[] args) 
    {
        TCImplicit obj=new TCImplicit();
        obj.implicit();
    }
    static void show()
    {
        char c='A';
        int a=++c;
        System.out.println(a);
        TCImplicit aobj=new TCImplicit();
        String s=aobj.meth1();
        System.out.println(s);
    }
    String meth1()
    {
        String s="Implicit casting is done by the compiler automatically.";
        return s;
    }
}
