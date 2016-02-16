import javax.swing.JOptionPane;
public class PasswordCreator
{
    public static void main(String [] args)
    {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        int comparelastandpass = 0;
        String lastNameLowerCase = lastName.toLowerCase();
        String passwordLowerCase = password.toLowerCase();

        while(comparelastandpass >=0)
        {
            comparelastandpass = passwordLowerCase.indexOf(lastNameLowerCase);
            if(comparelastandpass >= 0)
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