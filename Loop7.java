public class Loop7 
{
    void meth1()
    {
        int arr[]={10,20,30,40,50};
        System.out.println("reteriving the data by using the for loop");
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("reteriving the data in reverse order by using the for loop");
        for(int i=3;i>=1;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("reteriving the data by using the for-each loop");
        for(int x:arr)
        {
            System.out.println(x);
        }


    }
    public static void main(String[] args) {
        new Loop7().meth1();
    }
    
}
