public class MySong
{
    //1.instances
    private int year;
    private double length;
    private String name;
    private String artist;
    
    //2.constructor zero argument because there is nothing in ()
    public MySong()
    {
        year = 2014;
        length = 5.15;
        name= new String("Magic");
        artist = new String("Coldplay");
    }
    
    //three-argument constructor 
    public MySong(int year, double length, String name, String artist)
    {
        this.year=year;
        this.length=length;
        this.name= new String(name);
        this.artist= new String(artist);
    }
    
    
  
    //3.toString() turn into a string to print 
    public String toString()
    {
        String output = new String();
        output="The name of the song is: " + name + " by "+ artist +"."+ "\n"+ "The song came out in " + year +" and it is " + length +" minutes long.";
        return output;
    }
}// end class MySong
