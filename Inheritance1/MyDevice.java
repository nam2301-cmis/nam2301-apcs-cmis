public class MyDevice
{
    private int memory;
    private String language;
    
    public MyDevice(int memory,String language)
    {
        this.memory=memory;
        this.language=language;
    }
    
    public String toStrig()
    {
        return String.format("Memory: ",memory,"Language ",language);
    }
}