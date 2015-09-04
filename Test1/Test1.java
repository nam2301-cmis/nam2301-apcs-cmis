import javax.swing.JOptionPane;

public class Test1
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a number");
        float num = Integer.parseInt(input);
        
        for(int index = 0; index < num.length;index++)
        {
            int random = (int)(Math.random()*50);
            
        }
        
        
    }
}