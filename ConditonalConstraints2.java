public class ConditonalConstraints2 
{
    void meth1()
    {
        ConditonalConstraints2 obj =new ConditonalConstraints2();
        System.out.println("Implementing Switch case");
        int i=65;
        byte b=30;
        final int x=40;
        switch(b+10)
        {
            default:
            System.out.println("default case is executed");
            break;
            case 10+90:
            System.out.println("case 10 executed");
            break;
            case 'A':
            System.out.println("int and char both are compatable");
            break;
            case 300:
            System.out.println("case 300 executed");
            break;
            case x:
            System.out.println("case 40 is executed");
            if(i=='B')
            {
                System.out.println("if block executed");
                obj.meth2();

            }
            else
            {
                System.out.println("else block executed");
                obj.meth3();
            }
            break;
            case 50:
            System.out.println("case 50 executed");
            break;


        }
        System.out.println("compiler comming out from the switch block");

    }   
    void meth2()
    {
        System.out.println("meth2() called");
    }
    void meth3()
    {
        System.out.println("meth3() caleed");
    }
    public static void main(String[] args) {
        new ConditonalConstraints2().meth1();
    }
}
