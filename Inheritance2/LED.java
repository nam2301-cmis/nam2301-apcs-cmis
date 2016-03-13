public class LED extends Television
{
    private String model;
    private double price;
    
    public LED()
    {
        this.model="LED Platinum";
        this.price=399.99;
    }
    
    public LED(String model,double price)
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