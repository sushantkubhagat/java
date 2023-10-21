public class statc4 
{
    final static int x;
    static
    {
        x=50;
        System.out.println("static block executed");
    }   
    public static void main(String[] args) 
    {
        System.out.println("main() executed");   
    }
    static 
    {
        System.out.println("static block executed");
    }
}
