public class MyPod
{
    private String color;
    private String[] songlist;
    private int memory;
    
    public MyPod()
    {
       this.color = new String("Blue");
       this.songlist = new String[3];
       this.memory = 32;
    }
    
    public MyPod( String color, int memory)
       {
        this.color = new String( color ); 
        this.songlist = new String[3];
        this.songlist.add(new String("Holding On to You"));
        //songlist[0] = new String("Holding On to You");
        //songlist[1] = new String("Stressed Out");
        //songlist[2] = new String("Magic");
           
       }
 
}