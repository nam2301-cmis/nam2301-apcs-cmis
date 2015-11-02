public class Card
{
    //instances 
    private String rank;
    private String suit;
    
    //zero argument
    public Card()
    {
        rank=5;
        suit="♥";
    }//end zero constructor 
    
    //multi arguments
    public Card(String rank,String suit)
    {
        this.rank=rank;
        this.suit=suit;
    }//end multi arguments constructor
    
    
}