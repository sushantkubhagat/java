public class Return_Method 
{
    void meth1()
    {
        System.out.println(10);
        System.out.println(20);
        System.out.println(30);
        return;
    }
    int meth2()
    {
        System.out.println("meth2() called");
        return 99;
    }
    int meth3()
    {
        System.out.println("meth3() called");
        int a=10;
        if(a<5)
        {
            System.out.println("if block executed");
            return 100;
        }
        else
        {
            System.out.println("else block executed");
            return 200;
        }
    }
    public static void main(String[] args) 
    { 
        System.out.println("start");
        Return_Method obj=new Return_Method(); 
        obj.meth1();
        System.out.println("========================");
        int x=obj.meth2();
        System.out.println("meth2() id returnig :"+x);
        System.out.println("=========================");
        int y=obj.meth3();
        System.out.println("meth3() is returnig :"+y);
        System.out.println("end");

    }
    
}
