public class statc10 
{
    static int x=10;
    static int y=20;
    static 
    {
        System.out.println("test 1 called");
        System.out.println("x"+x);
        System.out.println("y"+y);
    }
    static void m1()
    {
        int x=100;
        System.out.println("static nethod");
        System.out.println("x:"+x);;
        System.out.println("y"+y);

    }
    public static void main(String[] args) {
         m1();

    }
    static{
        System.out.println("test 2 clled");
        System.out.println("x"+x);
        System.out.println("y"+y);
    }
}
