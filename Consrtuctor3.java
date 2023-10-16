public class Consrtuctor3 
{   
    int a=10;
    public String testmeth()
    {
        new Consrtuctor3(100,200,"java");
        System.out.println(40);
        return new Consrtuctor3().testmeth3(new Consrtuctor3(50).testmeth2())+new Consrtuctor3().testmeth4("hi");
    }
    Consrtuctor3()
    {
        System.out.println("hi");
    }
    public int testmeth2()
    {
        System.out.println(50);
        return 10+15;

    }
    Consrtuctor3(int a)
    {
        System.out.println("java is awesome");

    }
    public String testmeth3(int a)
    {
        System.out.println(18);
        return "is";

    }
    Consrtuctor3(int a, int b, String s)
    {
        System.out.println(a+b);
        System.out.println(s);
    }
    public String testmeth4(String s)
    {
        System.out.println(88);
        return "good";
    }
    public static void main(String[] args) 
    {
        Consrtuctor3 t1=new Consrtuctor3();
        t1.a=10;
        Consrtuctor3 t2=new Consrtuctor3(50);
        t2.a=30;
        System.out.println("java"+t1.testmeth()+" "+(t1.a+t2.a-30));   
    }
}
