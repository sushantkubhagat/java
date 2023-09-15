public class MethodD 
{
    public int meth1()
    {
        System.out.println("meth1() calling");
        return 500;
    }
    public int meth2(int a, int b)
    {
        System.out.println(" meth2() calling");
        System.out.println("a :"+a);
        System.out.println("b:"+b);
        return a+b;
    }
    public static void main(String[] args) 
    {
        System.out.println("start");
        MethodD obj= new MethodD();
        
        int i= obj.meth1();
        System.out.println("meth1()is returning :"+i);

        System.out.println(obj.meth2(1, 99));
        
        System.out.println("end");

        
    }
    
}
