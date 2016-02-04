import javax.swing.JOptionPane; 

public class Array2D3
{
    public static void main ( String arg[] )
    {
        int col = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int row = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int number[][] = new int[row][col];
        
        for (int x = 0; x < col; x++)
        {
            System.out.print(x + "\t");
        }
        System.out.print("\n");
        for(int r = 1; r < number.length; r++)
        {
            System.out.print(r + "\t");
            for(int c = 1; c < number[0].length; c++)
             {
                number[r][c] = (r * c);  
                System.out.print(number[r][c] + "\t"); 
             }
            System.out.print("\n"); 
        }
    }
}