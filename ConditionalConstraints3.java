public class ConditionalConstraints3 
{
    void meth1(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater");

            }
            else 
            {
                System.out.println("c is gretaer");
            }

        }
        else 
        {
            if(b>c)
            {
                System.out.println("b is greater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
    } 
    public static void main(String[] args) {
        ConditionalConstraints3 obj= new ConditionalConstraints3();
        obj.meth1(45, 55, 60);
    }   
}
