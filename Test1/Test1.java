import javax.swing.JOptionPane;

public class Test1
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a number");
        int num = Integer.parseInt(input);
        int[] number = new int[num] ;
        for(int index = 0; index < number.length;index++)
        {
            double random = (double)(50.0)*Math.random();
            
        }
        
        int index = 0;
        while (index< number.length)
        {
            System.out.println(number[index]);
            index++;
        }
        
        for(int i= number.length-1; i >=0;i--)
        {
            System.out.println(number[index]);
           if(random%2==0)
           {
               number[index] = double(50.0)*Math.random();
               number < 0;
               decimals++;
           }
           
           else
           {
           }
            
        }
        
        
        
        
       
    }
}