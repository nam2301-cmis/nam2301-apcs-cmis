public class Labtop extends MyDevice
{
    String brand;
    int flipdegree;
    
    public Labtop()
    {
        super();
        this.brand=new String("Dell");
        this.flipdegree=100;
    }
    
    public Labtop(int memory,String language)
    {
        super(memory, language);
        
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    
    public int getflipdegree()
    {
        return flipdegree;
    }
    
    public void setflipdegree()
    {
        this.flipdegree=flipdegree;
    }
    
    public String toString()
    {
        String output = new String("");
        output =super.toString() + "Brand: "+brand+"\n"+"Flipdegree: "+flipdegree;
        return output;
    }
}
