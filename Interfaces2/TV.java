public abstract class TV
{
    private boolean TVon;
    public TV()
    {
        TVon=true;
    }
    
    public boolean getTVon()
    {
        return TVon;
    }
    
    public void setTVOn(boolean TVon)
    {
        this.TVon=TVon;
    }
    
    public abstract String tvType();
}