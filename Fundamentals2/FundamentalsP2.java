import javax.swing.JOptionPane;

public class FundamentalsP2
    {
        public static void main(String[] args)
        {
            String input1 = JOptionPane.showInputDialog("Enter a number!");
            String input2 = JOptionPane.showInputDialog("Enter another number!");
            
            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);
            
            if (a > b)
            {
                System.out.println("The value of a is " + a + " and it is greater than  whose value is " + b + "." );
            }
            if (a < b)
            {
                System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");
            }
            if (a == b)
            {
                System.out.println("THe value of a is " + a + " and it is equal to b whos value is " + b + ".");
            }
        }
    }
