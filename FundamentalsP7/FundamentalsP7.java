
public class FundamentalsP7
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length;index++)
        {
            numbers[index] = (int)((Math.random()*100)*-1);
        }
        int index= 0;
        while(index<100);
        {
            System.out.println(numbers[index]);
        }
        
    }

}
