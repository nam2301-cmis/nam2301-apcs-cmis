public class Phone extends MyDevice
{
    String owner;
    int version;
    
    public Phone()
    {
        //super is getting the info from the main(mydevice)
        super();
        this.owner=new String("Bobby");
        this.version=5;
    }
    
    public Phone(int memory,String language,String owner,int version)
    {
        super(memory,language);
        this.owner=owner;
        this.version=version;
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
    
    public void setVersion()
    {
        this.version=version;
    }
    
    public String toString()
    {
        return super.toString()+String.format("Owner: ",owner,"Version",version);
    }
}