public class demo
{
    public void sum()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Addition value :"+c);
    }
    public void sub()
    {
        int a=30;
        int b=20;
        int c=a-b;
        System.out.println("Substraction value :"+c);
    }
    public static void main(String[] args)
    {
        System.out.println("Start");
        demo obj=new demo();
        obj.sum();
        obj.sub();
        System.out.println("java is awsome");
    }

    

}