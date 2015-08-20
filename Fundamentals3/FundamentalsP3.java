import javax.swing.JOptionPane;

public class FundamentalsP3
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a number!");
        
        int num = Integer.parseInt(input);
        
        if (num % 2 == 1)
        {
            System.out.println(input + " is an odd number.");
           
        }
        
        if (num % 2 == 0)
        {
            System.out.println(input + " is an even number.");
        }
    }
}
