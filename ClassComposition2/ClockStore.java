
public class ClockStore
{
    private Clock[] ClocksInStock;
    
   
    //zero-argument
    public ClockStore()
    {
       this.ClocksInStock = new Clock[3];
       ClocksInStock[0]= new Clock(12,34,56);
       ClocksInStock[1]= new Clock(11,52,59);
       ClocksInStock[2]= new Clock(10,25,38);
    }
    
    
    public int MostSeconds()
     {
         int max = 0;
         for(int i = 0 ; i < ClocksInStock.length; i++)
         {
            if(ClocksInStock[i].TotalSeconds()>ClocksInStock[max].TotalSeconds())
            {
                max = i;
            }
            
         }
         return max;
     }
    
    public String toString()
    {
        String output = new String();
        output ="The Clock that has the highest total seconds is clock"+ MostSeconds()+"\n";
        for (Clock x : ClocksInStock)
        {
            output += x + "\n";
        }
        return output;
    }
}
