import java.util.Scanner;
public class Util 
{
    Scanner sc= new Scanner(System.in);
    void meth1()
    {
        System.out.println("please enter the first number");
        int a=sc.nextInt();
        System.out.println("a value: "+a);

        System.out.println("please enter the second number");
        int b=sc.nextInt();
        System.out.println("a value: "+b);

        int c=a+b;
        System.out.println("total :"+c);
    }
    void meth2()
    {
        System.out.println("please enter yoiur age");
        int age=sc.nextInt();
        if(age>=18)
            System.out.println("you are eligible to vote");
        else    
            System.out.println("you are not eligible to vote");

    }
    int meth3(int a)
    {
        System.out.println("a value:"+a);
        System.out.println("please enter the number to return");
        return sc.nextInt();
    }
    void meth4()
    {
        System.out.println("what is your name ");
        sc.nextLine();

        String name=sc.nextLine();
        System.out.println("user name: "+name);
    }
    public static void main(String[] args) {
        Util obj=new Util();
        obj.meth1();
        System.out.println("--------------");
        obj.meth2();
        System.out.println("--------------");
        System.out.println("please enter one parameter for meth3():");
        System.out.println(obj.meth3(obj.sc.nextInt())+obj.sc.nextInt());
        obj.meth4();;
        

    }
}
    