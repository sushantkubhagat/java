public class operator
{
    void meth1()
    {
        int a=10;
        System.out.println(a++);
        a++;
        System.out.println(a++);
        System.out.println(--a);
        a++;
        ++a;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(--a);
        a++;
        System.out.println(--a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a++);
        System.out.println(a);
    }
    public static void main(String[] args) 
    {
        operator obj=new operator();
        obj.meth1();   
    }
}
