public class TC 
{
    void disply()
    {
        byte x;
        int a=170;
        double b=128.128;
        x=(byte)a;
        System.out.println("a and x"+a+"  "+x);
        a=(int)b;
        System.out.println("b and a"+b+"  "+a);
        b=x;
        System.out.println("b and x"+b+ " "+x);
    }   
    public static void main(String[] args) 
    {
        TC obj=new TC();
        obj.disply();

    }
}
