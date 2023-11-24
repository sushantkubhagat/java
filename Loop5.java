public class Loop5 
{
    void display(int n)
    {
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        new Loop5().display(5);
    }
    
}
