public class Jump1 
{
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("i value: "+i);
                        if(i==0)
                            break one;
                        if(i==1)
                            break two;
                        if(i==2)
                            break three;
                    }
                    System.out.println("after label three");
                }
                System.out.println("after label two");
            }
            System.out.println("after label one");
        }
    }
    
}
