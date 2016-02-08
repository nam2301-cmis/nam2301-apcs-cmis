import javax.swing.JOptionPane;

public class Array2D4
{
    public static void main (String[] args)
    {
        int rowinput = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int colinput = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[][] alphabet = new String[rowinput][colinput];
        
        int num = 0;//as the index of the letters

        for(int row = 0; row < alphabet.length; row++)
        {
            for(int col = 0; col < alphabet[0].length; col++)
            {
              alphabet[row][col] = letters[num];
              System.out.print(alphabet[row][col] + "\t");
              num++;
              //if it reaches z, start over with a
              if(num == 26)
              {
                  num= 0;
                }
            }
            System.out.print("\n");
        }
            
        
    }

}