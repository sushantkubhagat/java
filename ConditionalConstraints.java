public class ConditionalConstraints 
{
     void meth1(int a)
     {
        System.out.println("meth1()");
        if(a<=10)
        {
            System.out.println("a value:"+a);
        }
        System.out.println("meth1()called");
     }
     void meth2(int a)
     {
        System.out.println("meth2()");
        if(a<=10)
            System.out.println("hii");
            System.out.println("hello");
            System.out.println("meth2()called");
     }
     int meth3(int a)
     {
        System.out.println("meth3()");
        if(!(a<='A'))
            return 100;
            return 200;


     }
     void meth4(int a)
     {
        System.out.println("meth4");
        if (a<=5)
        {
            System.out.println("if block executed"+(++a));
            if(a<=6)
            { 
                new ConditionalConstraints().meth5(a);
            }
            System.out.println("compiler out from the inner if block");
        }
        System.out.println("meth4 executed");
     }
     void meth5(int a)
     {
        System.out.println("java is awesome"+a);
     }
     void meth6(int a)
     {
        System.out.println("meth 6 ");
        if (a<=3)
        {
            System.out.println("hii");
        }
        else
        {
            System.out.println("hello");
        }
        System.out.println("meth6 executed");
     }
     void meth7(int a)
     {
        System.out.println("meth7");
        if(false)
        {
            System.out.println("hii");
        }
        else
        {
            System.out.println("hello");
        }
        System.out.println("meth7()executed");
     }
     void meth8(int a)
     {
        System.out.println("meth8()");
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");

        }
        else
        {
            System.out.println("equal to 0");
        }
        System.out.println("meth8() executed");
     }
     public static void main(String[] args) {
        ConditionalConstraints obj=new ConditionalConstraints();
        obj.meth1(1);
        obj.meth2(10);
        System.out.println(obj.meth3('A'));
        obj.meth4('A'-60);
        obj.meth6(5);
        obj.meth7(15);
        obj.meth8(0);
     }
}
