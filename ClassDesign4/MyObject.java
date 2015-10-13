public class MyObject
{
    //instances
    private String type;
    private double sugar;
    
    //constructor
    public MyObject()
    {
        type = new String("milk chocolate");
        sugar= 52;
    }
    
    public MyObject(String type,double sugar)
    {
        this.type= new String(type);
        this.sugar=sugar;
    }
    
    //to string
    public String toString()
    {
        String output = new String();
        output="The type of the chocolate is "+type+" and it contains "+ sugar+" % of sugar.";
        return output;
    }
    
}// end class MyObject
