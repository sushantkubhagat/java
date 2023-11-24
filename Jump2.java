public class Jump2 
{
    void meth()
    {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                //break;
                //continue;
                return;
            }
            System.out.println("i value: "+i);
        }
    }
    public static void main(String[] args) {
        new Jump2().meth();
    }
    
}
