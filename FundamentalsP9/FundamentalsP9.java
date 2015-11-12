import javax.swing.JOptionPane;
public class FundamentalsP9
{
        public static void main(String[] args)
        {
            String input1 = JOptionPane.showInputDialog("Enter your username!");
            String input2 = JOptionPane.showInputDialog("Enter your password!(in numbers)");
            int num = Integer.parseInt(input2);
            if (input1.equals("Nam") && (num==2301))
            {
                System.out.println("You have successfully logged in");
            }
            else
            {
                System.out.println("Login unsuccessful…try again");
            }
            
        }
}
