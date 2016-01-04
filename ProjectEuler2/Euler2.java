
public class Euler2
{
   
    public Euler2()
    {
        int a = 1;
        int b = 1;
        int result = 0 ;
        int finalans = 0 ;
        while (finalans<4000000)
        {
            result = a + b;
            a = b ;
            b = result;
            if((result%2)==0)
            {
                finalans+=result;
            }
           
        }
        System.out.println("The sum of the even-valued terms is " + finalans);
    }
}
