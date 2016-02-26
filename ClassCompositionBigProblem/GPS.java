import java.util.ArrayList;
public class GPS

{
    public ArrayList<markers> Trail= new ArrayList<markers>();
    public GPS()
    {
        Trail.add(new markers(0,100));
        Trail.add(new markers(1,150));
        Trail.add(new markers(2,350));
        Trail.add(new markers(3,120));
        Trail.add(new markers(4,90));
        Trail.add(new markers(5,80));
        Trail.add(new markers(6,50));
        Trail.add(new markers(7,75));
        Trail.add(new markers(8,75));
        Trail.add(new markers(9,70));
        Trail.add(new markers(10,80));
        Trail.add(new markers(11,90));
        Trail.add(new markers(12,100));

    }

    public int getLength()
    {
        int length=0;
        for (int i=0; i<Trail.size(); i++)
        {
            length+= Trail.get(i).getY();
        }
        return length;
    }
    
    
    // A trail segment is considered level if the first marker and the last marker are at the same elevation and no markers between them are more than 10 meters higher or lower. 
    public boolean LevelTrailSegment(int begin, int end)
    {
        boolean level=true;
        for( int i = begin; i < end; i++)
        {
            if( i > begin && Math.abs(Trail.get(i).getY() - Trail.get(i-1).getY()) > 10)
            {
                level = false;
            }                    
        }
        if( Trail.get(begin).getY() == Trail.get(end).getY() && level == true)
        {
            return true;
        }
        else
        {
            return false;
        }
   }
   
    //A trail segment is considered difficult if it is not level and there is a net elevation gain of 100 or more.
    public boolean isDifficult(int begin, int end)
    {
        int Up = 0;
     
        for(int i = begin; i <= end; i++)
        {
            if(i > begin && Trail.get(i).getY() - Trail.get(i-1).getY() > 0)
            { 
                Up += Trail.get(i).getY()-Trail.get(i-1).getY();  
               
            }
        }
        if(Up > 100 && !LevelTrailSegment(begin,end))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public GPS(ArrayList<markers> Trail)
    {
        this.Trail=Trail;
    }

    public void addmarker ( markers newMarker )
    {
        Trail.add(newMarker);
    }

    public String toString()
    {
        String output = "";
        for (markers marker : Trail)
        {
            output+= marker;
        }
        return output;

    }//toString
}