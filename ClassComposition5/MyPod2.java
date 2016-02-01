import java.util.ArrayList;
public class MyPod2
{
    private String color;
    private ArrayList<String> songList = new ArrayList<String>();
    private int memory;
    
    //zero-argument
    public MyPod2()
    {
           color = new String ("Mint");
           memory = 32;
           songList.add("Holding On to You");
           songList.add("Stressed Out");
           songList.add("Magic");
    }
    
    //multi-argument
    public MyPod2( String color, int memory,ArrayList<String> songList)
       {
        this.color = new String( color ); 
        this.memory = memory;
        this.songList=songList;
        //this.songlist = new String[3];
        //this.songlist.add(new String("Holding On to You"));
        //songlist[0] = new String("Holding On to You");
        //songlist[1] = new String("Stressed Out");
        //songlist[2] = new String("Magic");
           
       }
      
       
       
    public String toString()
    {
        String output = new String();
        output = "My MyPod color is " + color + "\n" +
                 "The memory capacity is " + memory + "\n"+
                 "The song list:" + songList.size()+" ";
                 for(String s: songList)
                 {
                    output += "\n"+s;
                 }//for eachh loop
        return output;
    }
    
    
 
} //end class 