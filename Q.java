public class Q 
{
    int c;
    static int e;
    Q()
    {
        System.out.println(++c);
        System.out.println(++e);
    }
    public static void main(String[] args) {
        int a=34;
        int b=21;
        new Q().c-=a++ + ++b;
        int d=--a + --b + new Q().c--;
        e=a + +b + +new Q().c +d--;
        int f=-a + b-- + -new Q().c - d++;
        int sum= a+b+new Q().c+d+e+f;
        System.out.println("sum:"+sum);
    }
    
}
