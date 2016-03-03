public class ipod extends MyDevice
{
    String color;
    String type;
    
    public ipod()
    {
       super();
       this.color=new String("Blue");
       this.type=new String("Nano");
    }
    
    public ipod(int memory,String language)
    {
        super(memory,language);
       
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setColor()
    {
        this.color=color;
    }
    
    public void setType()
    {
        this.type=type;
    }
    
    public String toString()
    {
        String output = new String("");
        output =super.toString() + "Color: "+color+"\n"+"Type: "+type;
        return output;
    }
}