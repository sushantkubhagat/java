public class operator5 
{
    int meth1(int a)
    {
        if(a<=10)
        {
            System.out.println("if block executed");
            return 100;
        }
        else
        {
            System.out.println("else block executed");
            return 200;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(new operator5().meth1(10));   
    }
}
