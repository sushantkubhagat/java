public class demo2
{
   public void math() //math
   { 
        int a=10;
        System.out.println(10);
        demo2 aobj=new demo2();
        System.out.println(20);
        aobj.math2();
        System.out.println(a+20);
   }
   public void math2() //math2
   {    
        demo2 bobj=new demo2();
        System.out.println(40);
        bobj.math3();
        System.out.println(50);


   }
   public void math3() //math3
   {
       
        System.out.println(111);
        System.out.println(222);
        System.out.println("java is awsome");

   }
   public static void main(String[] args) 
   {
        System.out.println("Start");
        demo2 obj=new demo2();
        obj.math();
        System.out.println("end");

   }
}
