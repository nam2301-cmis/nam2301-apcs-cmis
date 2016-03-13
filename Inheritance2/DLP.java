public class DLP extends Television
{
    private String model;
    private double price;
    
    public DLP()
    {
        this.model="DLP Silver";
        this.price=99.99;
    }
    
    public DLP(String model,double price)
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