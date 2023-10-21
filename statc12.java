public class statc12
{
    static int x=m1();
    public static void main(String[] args) {
        System.out.println(statc12.x);
    }
    static 
    {
        System.out.println(x);
        statc12.x=x+20;

    }
    static int m1()
    {
        statc12.x=50;
        return m2();

    }
    static int m2()
    {
        System.out.println(statc12.x);
        return 100;
    }
}

