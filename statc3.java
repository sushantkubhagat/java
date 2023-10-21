public class statc3 
{
    int x=10;
    static int y=20;
    void meth1()
    {
        System.out.println("meth1() called");
        System.out.println("instance var:"+x);
        System.out.println("static var:"+y);
    }
    static void meth2()
    {
        System.out.println("meth2() called");
        System.out.println("instance var"+new statc3().x);
        System.out.println("static var"+y);

    }
    public static void main(String[] args) 
    {
        statc3 obj=new statc3();
        obj.meth1();
        statc3.meth2();   
    }
}
