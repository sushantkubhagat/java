public class MethodA 
{
    public void meth1()
    {
        System.out.println("Hi");
    }   
    public static void main(String[] args) 
    {
        MethodA obj=new MethodA();
        obj.meth1();
        new MethodA().meth1();
    
        
    }
}
