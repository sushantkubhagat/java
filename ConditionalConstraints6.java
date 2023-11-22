public class ConditionalConstraints6 
{
    void meth1(int a)
    {
        if(a<25)
        {
            System.out.println("F");
        }
        else if(a>=25 && a<45)
        {
            System.out.println("E");
        }
        else if(a>=45 && a<50)
        {
            System.out.println("D");
        }
        else if(a>=50 && a<60)
        {
            System.out.println("C");
        }
        else if(a>=60 && a<80)
        {
            System.out.println("B");
        }
        else if(a>=80)
        {
            System.out.println("A");
        }
    }
    public static void main(String[] args) {
        new ConditionalConstraints6().meth1(78);
    }
    
}
