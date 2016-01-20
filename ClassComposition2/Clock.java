public class Clock
{
    //instance
    private int hours;
    private int minutes;
    private int seconds;
    private int totalsecs;
    //constructor 
    public Clock()
    {
        hours = 15;
        minutes = 45;
        seconds = 23;
    }
    
    //three-argument constructor
    public Clock(int hours,int minutes, int seconds)
    {
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=minutes;
    }
    
    //convert time to seconds
    public int TotalSeconds()
    {
        totalsecs=(hours*3600)+(minutes*60)+seconds;
        return totalsecs;
    }
    
    //turn into a string to print
    public String toString()
    {
        String output= new String();
        output="The time is "+String.format("%02d",hours) + ":" +String.format("%02d", minutes) + ":" + String.format("%02d",seconds)
                +"Total time in seconds:" + String.format("%d",totalsecs);
        return output;
    }
    
}// end clss MyTime
