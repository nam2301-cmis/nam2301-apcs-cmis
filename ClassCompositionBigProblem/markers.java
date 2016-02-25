public class markers
{
    
    //getting stuff
    private int x;
    private int y;
    public markers( int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }


    public String toString()
    {
        String result = String.format( 
                "\nx: %d " +
                "y: %d",
                x, y);

        return result;
    }
}