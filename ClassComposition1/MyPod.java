public class MyPod
{
    private String color;
    private String[] songlist;
    private int memory;
    
    //zero-argument
    public MyPod()
    {
       this.color = new String("Blue");
       this.songlist = new String[3];
       this.memory = 32;
    }
    
    //multi-argument
    public MyPod( String color, int memory)
       {
        this.color = new String( color ); 
        this.memory = memory;
        this.songlist = new String[3];
        //this.songlist.add(new String("Holding On to You"));
        songlist[0] = new String("Holding On to You");
        songlist[1] = new String("Stressed Out");
        songlist[2] = new String("Magic");
           
       }
      
    public String toString()
    {
        String output = new String();
        output = "My MyPod color is " + color + "\n" +
                 "The memory capacity is " + memory + "\n";
            for(String s : songlist)
              {
                 output += s + "\n";
              }
        return output;
    }
    
    
 
} //end class 