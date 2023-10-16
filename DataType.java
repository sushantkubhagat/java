public class DataType 
{
    int i;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean flag;
    void meth1()
    {
        System.out.println("printing the default value of the datatype");
        System.out.println("int value:"+i);
        System.out.println("byte value :"+b);
        System.out.println("short value :"+s);
        System.out.println("long value:"+l);
        System.out.println("float value:"+f);
        System.out.println("double value::"+d);
        System.out.println("char value :"+c);
        System.out.println("boolean value"+flag);
    }
    void meth2()
    {
        int i1=45;
        int i2=66;
        int i3=i1+i2;
        System.out.println(i3);

        byte b1=10;
        byte b2=20;
        byte b3=(byte)(b1+b2);
        System.out.println("b3:"+b3);
        
        float f=85.96F;
        System.out.println(f);

        long x=2143783648L;
        System.out.println(x);
    }
    public static void main(String[] args) 
    {
        DataType obj=new DataType();
        obj.meth1();
        System.out.println("__________________________");
        obj.meth2();

        
    }
    
}
