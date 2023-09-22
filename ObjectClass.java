public class ObjectClass 
{
    void meth1()
    {
        System.out.println("Hi");
    }
    public static void main(String[] args) 
    {
        ObjectClass obj=new ObjectClass();
        ObjectClass obj1=new ObjectClass();

        int x=obj.hashCode();
        int y=obj1.hashCode();
        System.out.println("obj hashcode :"+x);
        System.out.println("obj1 hashcode :"+y);
        System.out.println("=====================");

        boolean result1=obj.equals(obj1);
        System.out.println("result1:"+result1);
        boolean result2=obj.equals(obj);
        System.out.println("result2:"+result2);

        
    }
    
}
