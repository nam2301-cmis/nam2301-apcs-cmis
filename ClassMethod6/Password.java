import javax.swing.JOptionPane;
public class Password
{
    public static void main(String[] args)
    {
         int count =0;
        String password=new String(JOptionPane.showInputDialog("Enter a password[at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.)]"));
        //variable that counts the weird letters.
       
      for(int i=0;i<password.length();i++)
      {
            if(password.substring(i).equals("+")||password.substring(i).equals("-")||password.substring(i).equals("*")||password.substring(i).equals("/")||password.substring(i).equals("@"))
        {
            count+=1;
        }
      }
      if (password.length()<6 || count == 0)
     {
        System.out.println("Try again!");
     }
     else
     {
        System.out.println("Succesful!");
     }
    }
}