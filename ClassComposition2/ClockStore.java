
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
         for(int i = 0 ; i < ClocksInStock.length; i++)
         {
            
         }
         
     }
    
}
