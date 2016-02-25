public class Phone extends MyDevice
{
    String owner;
    int version;
    
    public Phone(int memory,String language,String owner,int version)
    {
        super(memory,language);
        this.owner=owner;
        this.version=version;
    }
    
    public String toString()
    {
        return super.toString()+String.format("Owner: ",owner,"Version",version);
    }
}