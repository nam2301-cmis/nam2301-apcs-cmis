import javax.swing.JOptionPane;
public class PasswordCreator
{
    public static void main(String [] args)
    {
        String lastname = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
<<<<<<< HEAD
        int x = 0;
        String lastnameLowerCase = lastname.toLowerCase();
        String passwordLowerCase = password.toLowerCase();

        while(x >=0)
        {
            x = passwordLowerCase.indexOf(lastnameLowerCase);
            if(x >= 0)
=======
        int comparelastandpass = 0;
        String lastNameLowerCase = lastName.toLowerCase();
        String passwordLowerCase = password.toLowerCase();

        while(comparelastandpass >=0)
        {
            comparelastandpass = passwordLowerCase.indexOf(lastNameLowerCase);
            if(comparelastandpass >= 0)
>>>>>>> 9c91685a36a451bafa39926fcc3e61ff34ee3600
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