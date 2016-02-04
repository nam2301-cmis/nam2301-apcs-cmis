
public class Array2D1
{
    public static void main(String[] args)
    {
        int[][] numbers = new int[3][4];
        
        //getting the random numbers
        for(int row = 0; row < numbers.length; row++ )
            {
             for(int col = 0; col < numbers[0].length; col++ )
             {
                 numbers[row][col]= (int)(Math.random() * 9 ) ;
             }
            }
        
        //printing out    
        for( int row = 0; row < numbers.length; row++ )

           {

            for( int col = 0; col < numbers[0].length; col++ )

               {    

                System.out.print( numbers[row][col] + " " );

               } // end inner for

            System.out.println( "\n" ); 
            
            
           

            

           } // end outer for
           
        //finding number 5 
            for(int row = 0; row < numbers.length; row++ )
            {
             for(int col = 0; col < numbers[0].length; col++ )
             {
                 if(numbers[row][col]== 5)
                 {
                     System.out.print("Number 5 is in row "+ row+ "and column "+ col);
                 }
             }
            }
        System.out.println( "\n" ); 
    }
}



               

           

     