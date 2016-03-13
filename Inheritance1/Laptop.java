public class Laptop extends MyDevice
{
    String brand;
    int flipdegree;
    
    public Laptop()
    {
        super();
        this.brand=new String("Dell");
        this.flipdegree=100;
    }
    
    public Laptop(int memory,String language,String brand,int flipdegree)
    {
        super(memory, language);
        this.brand=brand;
        this.flipdegree=flipdegree;
    }
    
   
    public String toString()
    {
        String output = new String("");
        output =super.toString()+"\n" + "Brand: "+brand+"\n"+"Flipdegree: "+flipdegree;
        return output;
    }
}
