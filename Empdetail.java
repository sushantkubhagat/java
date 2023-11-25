import java.util.Scanner;
public class Empdetail 
{
   void meth1()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name :");
        String Empname=sc.next();
        System.out.println("enter you id :");
        int Empid=sc.nextInt();
        System.out.println("enter your department:");
        String Empdept=sc.next();
        System.out.println("enter your address:");
        sc.nextLine();
        String Add=sc.nextLine();
        System.out.println("---------------------------");
        System.out.println("Employee Detail's:==>");
        System.out.println("Employee name: "+Empname);
        System.out.println("Employee Id: "+Empid);
        System.out.println("Employee department: "+Empdept);
        System.out.println("Employee Address: "+Add);
   } 
   public static void main(String[] args) {
    new Empdetail().meth1();
   }
}
