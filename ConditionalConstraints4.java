public class ConditionalConstraints4 
{
    void meth1(int unit)
    {
        int bill=unit*100;
        if(bill>=1000)
        {
            int discount=(bill/100)*10;
            System.out.println("final bill:"+(bill-discount));
            System.out.println("you save "+discount+"on you final bill");
        }
        else{
            System.out.println("you bill :"+bill);
        }
    }   
    public static void main(String[] args) {
        new ConditionalConstraints4().meth1(12);
    }
}
