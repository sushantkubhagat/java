public class ObjectClass2 
{
    void meth1()
    {
        System.out.println("java is awesome");
    }
    protected void finalize()
    {
        System.out.println("garbage has been collected");
    }
    public static void main(String[] args) 
    {
        ObjectClass2 obj =new ObjectClass2();
        ObjectClass2 obj1=new ObjectClass2();
        System.out.println(obj.getClass());
        System.out.println("=================");
        System.out.println("obj :"+obj.toString());
        System.out.println("obj1 :"+obj1.toString());
        System.out.println("======================");
        obj.meth1();
        obj=null;
        System.gc();
        
    }
}
