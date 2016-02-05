public class Swappers
{
    public static void main(String[] args)
    {
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                                    {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                                    {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                                    {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                                    {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                                    {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                                    {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                                    {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                                    {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                                    {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        
        int num=0;                           
        int maxrow = 0;
        int maxcol =0;
        int rowpro=0;
        int colpro=0;
        //int intersection=[maxrow][maxcol];
        //getting the no
        for(int row =0;row<grid.length;row++)
        {
            for(int col=0;col<grid.length;col++)
            {
                System.out.print(grid[row][col]+" ");
            }
            System.out.print("\n");
        }
        
         //row timing
        for(int row=0;row<grid.length;row++)
        {
            for(int col=0;col<grid[0].length;col++)
            {
                if(row!=0)
                {
                    rowpro *=grid[row][row];
                     if(rowpro>maxrow)
                  {
                      maxrow=rowpro;
                   }
                 
                }
                
                if(maxrow==0)
                {
                   // intersection;
                }
                
            }
            System.out.print("the max row is "+ rowpro+"\n");
        }
       
        
        //col timing
        for(int col=0;col<grid[0].length;col++)
        {
            for(int row = 0 ;row<grid.length;row++)
            {
                 if(col!=0)
                {
                    colpro *=grid[col][col];
                     if(colpro>maxcol)
                  {
                      maxcol=colpro;
                  }
                }
                
               
                if(maxrow==0)
                {
                   // intersection;
                }
                
            }
            System.out.print("the max col is "+ maxcol+"\n");
    }
    
    
  }
}