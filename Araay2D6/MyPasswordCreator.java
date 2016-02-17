import javax.swing.JOptionPane;
public class MyPasswordCreator
{
    public static void main(String [] args)
    {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        int x = 0;
        String lastNameLowerCase = lastName.toLowerCase();
        String passwordLowerCase = password.toLowerCase();
        //use to compare each alphabet 
        while(x >=0)
        {
            x = passwordLowerCase.indexOf(lastNameLowerCase);
            if(x >= 0)
            {
                passwordLowerCase = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
            }
            else
            {
                System.out.print("You are logged in!");
            }
        }
    }
}