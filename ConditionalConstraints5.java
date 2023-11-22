public class ConditionalConstraints5 
{
    void meth1(char operator, int a, int b)
    {
        switch(operator)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;

        }
        
    }
    public static void main(String[] args) {
        new ConditionalConstraints5().meth1('*', 5, 2);
    }
    
}
