public class MethodB 
{
    public void meth1()
    {
        System.out.println("Hii");
    }
    public void meth2()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) 
    {
        MethodB obj= new MethodB();
        obj.meth1();
        obj.meth2();
        System.out.println("-------------");
        new MethodB().meth1();
        new MethodB().meth2();
        
    }
    
}
