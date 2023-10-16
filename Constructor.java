public class Constructor 
{
    Constructor()
    {
        System.out.println("non-parameterized conastructor");
        new Constructor(999).meth2();

    }   
    Constructor(int a)
    {
        System.out.println("parameterixed constructor");

    }
    void meth1()
    {
        System.out.println("meth1() is called");
    }
    void meth2()
    {
        System.out.println("meth2() is called");
    }
    public static void main(String[] args) 
    {
        Constructor obj=new Constructor();
        obj.meth1();   
    }


}
