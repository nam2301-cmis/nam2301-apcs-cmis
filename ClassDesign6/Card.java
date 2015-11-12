public class Card
{
    //instances 
    public String rank;
    public String suit;
    
    //zero argument
    public Card()
    {
        rank="5";
        suit="♥";
    }//end zero constructor 
    
    //multi arguments
    public Card(String rank,String suit)
    {
        this.rank=rank;
        this.suit=suit;
    }//end multi arguments constructor
    
    //toString()
    public String toString()
    {
        String output = new String();
        output="The card in my hand is "+suit+rank;
        return output;
    }// end toString
    
}//end card

