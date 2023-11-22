public class Autoboxing 
{   
    void meth1()
    {
        int i=100;
        Integer ival=Integer.valueOf(i);
        System.out.println("int pdt"+i);
        System.out.println("int wco"+ival);
        System.out.println("+++++++++++++++++++++++++");
        byte b=50;
        Byte bval=Byte.valueOf(b);
        System.out.println("byte pdt"+b);
        System.out.println("Byte wco"+bval);
        System.out.println("++++++++++++++++++++++++++");
        Integer ival2=Integer.valueOf(500);
        Byte bval2=Byte.valueOf((byte)20);
        System.out.println("int wco"+ival2);
        System.out.println("byte wco"+bval2);
    }
    public static void main(String[] args) {
        new Autoboxing().meth1();
    }
}
