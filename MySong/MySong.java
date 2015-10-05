public class MySong
{
    //variables
    private int year;
    private double length;
    private String name;
    private String artist;
    
    //constructor zero argument because there is nothing in ()
    public MySong()
    {
        year = 2014;
        length = 5.15;
        name= new String("Magic");
        artist = new String("Coldplay");
    }
    
    public MySong(int year, double length, String name, String artist)
    {
        this.year=year;
        this.length=length;
        this.name= new String(name);
        this.artist= new String(artist);
    }
    
}// end class MySong
