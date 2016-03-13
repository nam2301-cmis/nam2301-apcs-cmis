public class Phone extends MyDevice
{
    String owner;
    int version;
    
    public Phone()
    {
        //super is getting the info from the main(mydevice)
        super();
        this.owner=new String("Bobby");
        this.version= 8; 
    }
    
    public Phone(int memory,String language,String owner,int version)
    {
        super(memory,language);
        this.owner=owner;
        this.version=version;
    }
    
    
    
    public String toString()
    {
        String output = new String("");
        output =super.toString() +"\n" +"Owner: "+owner+"\n"+"Version: "+version;
        return output;
    }
}