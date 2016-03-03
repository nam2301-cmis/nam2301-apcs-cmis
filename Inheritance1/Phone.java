public class Phone extends MyDevice
{
    String owner;
    int version;
    
    public Phone()
    {
        //super is getting the info from the main(mydevice)
        super();
        this.owner=new String("Bobby");
    }
    
    public Phone(int memory,String language)
    {
        super(memory,language);
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public void setOwner(String owner)
    {
        this.owner=owner;
    }
    
    public int getVersion()
    {
        return version;
    }
    
    public void setVersion(int version)
    {
        this.version=version;
    }
    
    public String toString()
    {
        String output = new String("");
        output =super.toString() + "Owner: "+getOwner()+"\n"+"Version: "+getVersion();
        return output;
    }
}