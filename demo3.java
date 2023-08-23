public class demo3 
{
    public void math1()
    {
        demo3 obj2=new demo3();
        obj2.math5();
        int a=10;
        System.out.println(10);
        System.out.println(56+a);

    }
     public void math2()
    {
        int a=20;
        System.out.println(77-a);
        demo3 obj4=new demo3();
        obj4.math4();
    }
     public void math3()
    {
        int a=10;
        demo3 obj1=new demo3();
        System.out.println(89+1);
        obj1.math1();
        System.out.println(a);
    }
     public void math4()
    {
        System.out.println(89);
        System.out.println(85);
        System.out.println(44);



    }
     public void math5()
    {
        System.out.println(77);
        demo3 obj3=new demo3();
        obj3.math2();
        System.out.println(99);
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        demo3 obj=new demo3();
        obj.math3();
        System.out.println("end");
    }

    
}
