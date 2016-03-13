public class MyDevice
{
    private int memory;
    private String language;
    
    public MyDevice()
    {
        this.memory=32;
        this.language=new String("Thai");
    }
    public MyDevice(int memory,String language)
    {
        this.memory=memory;
        this.language=language;
    }
    
    public String toString()
    {
        String output = new String("");
        output ="Memory: "+memory+"\n"+"Language "+language;
        return output;
    }
}