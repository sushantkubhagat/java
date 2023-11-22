public class Unboxing 
{
    void meth1()
    {
        Integer ival1=new Integer(100);
        Integer ival2=new Integer(200);
        Integer ival3=new Integer(300);

        int i1=ival1.intValue();
        int i2=ival2.intValue();
        int i3=ival3.intValue();

        System.out.println("int wco"+ival1);
        System.out.println("int pdt"+i1);


    }   
    public static void main(String[] args) {
        new Unboxing().meth1();
    } 
}
