import javax.swing.JOptionPane;
public class MySong
{
    String username = JOptionPane.showInputDialog("What is your username?");
    int password = Integer.parseInt(JOptionPane.showInputDialog("What is your password?"));
    
    //1.instances
    private int yearReleased;
    private double length;
    private String name;
    private String artist;
    String duration="";
    
    //2.constructor zero argument because there is nothing in ()
    public MySong()
    {
        yearReleased = 2014;
        length = 343;
        name= new String("Magic");
        artist = new String("Coldplay");
    }
    
    public int getYearReleased()
    {
        return yearReleased;
    }// end method getYearReleased
    
    public void setYearReleased(int year)
    {
        if(username.equals("Nam")&& password ==(2301))
        {
        this.yearReleased = year;
        }
    }//end method setYearReleased
    
    //dont need three-argument constructor 
    
    //converting mins to mins n seconds
    public String convertToMinSec()
    {
        duration=(int)(length/60) + "."+(int)(length%60);
        return duration;
    }
    //3.toString() turn into a string to print 
    public String toString()
    {
        String output = new String();
        output="The name of the song is: " + name + " by "+ artist +"."+ "\n"+ "The song came out in " + yearReleased +" and it is " + length +" minutes long.";
        return output;
    }
}// end class MySong



