public class Array2D2
{
    public static void main(String[] args)
    {
        int[][] numbers =  new int[3][5];
        
        //getting no.1-15
        for(int row= 0; row<numbers.length;row++)
        {
            for(int col = 0;col < numbers[0].length;col++)
            {
            numbers[row][col] = row * col;
            }
        }
        
        //printing out    
        for( int row = 1; row < numbers.length; row++ )

           {

            for( int col = 1; col < numbers[0].length; col++ )

               {    

                System.out.print( numbers[row][col] + " " );

               } // end inner for

            System.out.println( "\n" ); 
            
  
            

           } // end outer for
    }
}