public class LCD extends Television
{
    private String model;
    private double price;
    
    public LCD()
    {
        this.model="LCD Gold";
        this.price=199.99;
    }
    
    public LCD(String model,double price)
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