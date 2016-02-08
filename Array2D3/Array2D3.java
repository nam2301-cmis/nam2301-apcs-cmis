import javax.swing.JOptionPane; 

public class Array2D3
{
    public static void main ( String arg[] )
    {
        int colinput = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int rowinput = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int number[][] = new int[rowinput][colinput];
        
        //printing the index
        for (int index = 0; index < colinput; index++)
        {
            System.out.print(index + "\t");
        }
        System.out.print("\n");
        
        //printing the rest
        for(int row = 1; row < number.length; row++)
        {
            System.out.print(row + "\t");
            for(int col = 1; col < number[0].length; col++)
             {
                number[row][col] = (row * col);  
                System.out.print(number[row][col] + "\t"); 
             }
            System.out.print("\n"); 
        }
    }
}