public class MyTime
{
    //instance
    private int hours;
    private int minutes;
    private int seconds;
    
    //constructor 
    public MyTime()
    {
        hours = 15;
        minutes = 45;
        seconds = 23;
    }
    
    //three-argument constructor
    public MyTime(int hours,int minutes, int seconds)
    {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=minutes;
    }
    
    //turn into a string to print
    public String toString()
    {
        String output= new String();
        output="The time is "+String.format("%02d",hours) + ":" +String.format("%02d", minutes) + ":" + String.format("%02d",seconds);
        return output;
    }
    
}// end clss MyTime
