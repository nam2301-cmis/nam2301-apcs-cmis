public class MyDeviceExtend extends MyDevice
{
    String owner;
    int version;
    
    public MyDeviceExtend(String color,String songlist,int memory,String owner,int version)
    {
        super(color,songlist,memory);
        this.owner=owner;
        this.version=version;
    }
    
    public String toString()
    {
        return super.toString()+String.format("Owner: ",owner,"Version",version);
    }
}