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
   
    
    public String toString()
    {
        String output = new String("");
        output =super.toString()+"\n" + "Color: "+color+"\n"+"Type: "+type;
        return output;
    }
}