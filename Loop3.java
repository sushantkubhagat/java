public class Loop3 
{
    void meth1()
    {
        System.out.println("meth1()");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i value:"+i);
        }
        System.out.println("meth1() executed");
    }
     void meth2()
    {
        System.out.println("meth2()");
        for(int i=1;i<=10;i++)
        {
            System.out.println("i value:"+i);
            i++;
        }
        System.out.println("meth2() executed");
    }
    void meth3()
    {
        System.out.println("meth3()");
        int i=1;
        for(;i<=5;)
        {
            System.out.println("i value:"+(++i));
            i++;
        }
        System.out.println("meth3() executed");
    }
    void meth4()
    {
        Loop3 obj=new Loop3();
        int i=1;
        for(System.out.println("meth4()"),System.out.println(obj.meth5());i<=5;obj.meth6())
        {
            System.out.println("i value:"+i);
            i++;
        }
        System.out.println("meth4() executed");
    }
    String meth5()
    {
        System.out.println("meth5() executed");
        return "java is awesome";
    }
    void meth6()
    {
        System.out.println(" ==========================");
    }
    void meth7()
    {
       System.out.println("meth7()");
        int i=1;
        for(; ;)
        {
            System.out.println("i value:"+i);
            i++;
        }
       // System.out.println("meth7() executed"); 
    }
    int meth8()
    {
        System.out.println("meth8() executed");
        return 1;
    }
    void meth9()
    {
        System.out.println("meth9()");
        
        for(int i=new Loop3().meth8();i<=100;i++)
            System.out.println("i value:"+(i++));
        System.out.println("meth9() executed");
    }
    public static void main(String[] args) {
        Loop3 obj=new Loop3();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        //obj.meth7();
        obj.meth9();
    }
}

