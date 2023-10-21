public class statc 
{
    int a;
    static int  b;
    statc()
    {
        a++;
        b++;
        System.out.println("instance variable"+a);
        System.out.println("static variable"+b);

    }   
    public static void main(String[] args) 
    {
        new statc();
        new statc();
        new statc();
           
    }
}
