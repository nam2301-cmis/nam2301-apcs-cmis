public class Array2D2
{
    public static void main(String[] args)
    {
        int[][] numbers =  new int[3][5];
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int i=0;
        int allsum = 0;
        int rowsum = 0;
        int colsum = 0;
        //getting no.1-15
        for(int row= 0; row<numbers.length;row++)
        {
            for(int col = 0;col < numbers[0].length;col++)
            {
              //numbers[row][col] = (int)((Math.random()*14)+1);;
             numbers[row][col] = num[i];
             i++;
            }
        }
        
        //printing out    
        for(int[] col:numbers)
        {
            for(int n:col)
            {
                System.out.print(n+" ");
                
            }
            System.out.print("\n");
        }
        
        //all sum
        for(int row = 0;row<numbers.length;row++)
        {
            for(int col=0;col<numbers[0].length;col++)
            {
                allsum += numbers[row][col];
            }
        }
        System.out.println("The total sum is " + allsum);
        
        //row sum 
        for(int row = 0;row<numbers.length;row++)
        {
            for(int col=0;col<numbers[0].length;col++)
            {
                rowsum+=numbers[row][col];
            }
            System.out.println("The sum of row " + row+ " is " + rowsum );
        }
        
        //colsum
        for(int col=0;col<numbers[0].length;col++)
        {
            for(int row = 0 ;row<numbers.length;row++)
            {
                colsum+=numbers[row][col];
            }
            System.out.println("The sum of column " + col + " is "+ colsum);
        }
    }
}