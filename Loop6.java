public class Loop6 
{
    void meth1()
    {
        int arr[]={10,20,30,40,50};
        System.out.println("reteriving the data by using the for loop");
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        new Loop6().meth1();
    }
}
