public class Constructor2 
{
    public Constructor2()
    {
        System.out.println("sunday");
        Constructor2 obj=new Constructor2(10);
        System.out.println("Tuesday");
        String s=obj.display("challeng Accepted");
        System.out.println(s);
    }   
    public Constructor2(int temp)
    {
        System.out.println("Saturday");
        new Constructor2(10,20);
        System.out.println("Monday");

    }
    String display(String s)
    {
        System.out.println(" In the statement i am returning String value");
        return s;

    }
    public Constructor2(int data, int temp)
    {
        System.out.println("Thusday");
    }
    public static void main(String[] args) 
    {
        Constructor2 obj=new Constructor2();
        System.out.println("Output verified");   
    }

}
