public class Loop4 
{
    void meth1(int a)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
    public static void main(String[] args) {
        new Loop4().meth1(5);
    }

    
}
