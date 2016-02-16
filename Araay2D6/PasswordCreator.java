import javax.swing.JOptionPane;
public class PasswordCreator
{
    public static void main(String [] args)
    {
        String lastname = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        int x = 0;
        String lastnameLowerCase = lastname.toLowerCase();
        String passwordLowerCase = password.toLowerCase();

        while(x >=0)
        {
            x = passwordLowerCase.indexOf(lastnameLowerCase);
            if(x >= 0)
            {
                passwordLowerCase = JOptionPane.showInputDialog( "What is your password?").toLowerCase();
            }
            else
            {
                System.out.print("You have successfully logged in");
            }
        }

    }
}