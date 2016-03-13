public class Plasma extends Television
{
    private String model;
    private double price;
    
    public Plasma()
    {
        this.model="Plasma Sapphire";
        this.price=499.99;
    }
    
    public Plasma(String model,double price)
    {
        this.model=model;
        this.price=price;
    }
    
   public String toString()
    {
        String output= new String("");
        output="The model of this tv is: "+this.model+"      "+"Price: "+this.price;
        return output;
    }
}