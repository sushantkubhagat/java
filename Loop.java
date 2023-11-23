public class Loop 
{
    void meth1(int a)
    {
        System.out.println("meth1()");
        while(a<=5)
        {
            System.out.println("a value"+a);
            a++;

        }
        System.out.println("meth1()executed");
    }
    void meth2(int a)
    {
        System.out.println("meth2()");
        while(a<=3)
        {
            System.out.println("a value"+a);
            a++;
        }
        System.out.println("meth2()executed");
    }
    void meth3(int a)
    {
        System.out.println("meth3()");
        while(true)
        {
            System.out.println("a value"+a);
            a++;
        }
        //System.out.println("meth3() executed");
    }
    void meth4(int a)
    {
        System.out.println("meth4()");
        do
        {
            System.out.println("a value "+a);
            a++;
        }
        while(a<=5);
        System.out.println("meth4() executed"+a);
    }
    public static void main(String[] args) {
        Loop obj=new Loop();
        obj.meth1(10);
        //obj.meth2(1);
        //obj.meth3(1);
        obj.meth4(1);
    }

    
}
