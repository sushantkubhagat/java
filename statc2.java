public class statc2 
{
    int a;
    static int b;
    statc2()
    {
        a++;
        b++;
        System.out.println("instance var:"+a);
        System.out.println("static var:"+b);
        /*System.out.println("static var:"+new statc2().b);*/
        System.out.println("static var:"+statc2.b);

    }   
    public static void main(String[] args) 
    {
        new statc2();
        new statc2();
        new statc2();   
    }
}
