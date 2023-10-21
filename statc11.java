public class statc11 {
    static int a=0;
    int b=0;
    statc11()
    {
        a++;
        b++;
        System.out.println("static variable:"+a);
        System.out.println("inastance variable:"+b);
        System.out.println("++++++++++++++++++++++");
    }
    void display()
    {
        System.out.println("accesssing sattic variable");
        System.out.println(statc11.a);
        System.out.println(a);
        System.out.println(new statc11().a);
    }
    public static void main(String[] args) {
        new statc11();
        new statc11();
        new statc11();
        System.out.println("###############################");
        new statc11().display();
    }
    

}
