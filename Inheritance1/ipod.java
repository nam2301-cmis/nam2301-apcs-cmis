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
    
    public ipod(int memory,String language,String color,String type)
    {
        super(memory,language);
        this.color=color;
        this.type=type;
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
        return super.toString()+String.format("Color: ",color,"Type",type);
    }
}