public class Constructor1 
{
    int StdRollNumber;
    String StdName;
    Constructor1(int num, String name)
    {
        StdRollNumber=num;
        StdName=name;


    } 
    public static void main(String[] args) 
    {
        Constructor1 obj=new Constructor1(100,"sushant");
        Constructor1 obj2=new Constructor1(200, "Payal");

        System.out.println(obj.StdRollNumber + "=>"+obj.StdName);
        System.out.println(obj2.StdRollNumber + "=>"+obj2.StdName);



 
    }  
}
