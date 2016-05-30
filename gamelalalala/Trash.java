import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        scoring();
        getScore();
        kill();
    }    
    int Score=0;
    public void kill()
    {
        if(isTouching(Garbage.class))
        {
            getWorld().removeObject(getOneIntersectingObject(Garbage.class));

        }
       else if(isTouching(iceCream.class))
        {
            getWorld().removeObject(getOneIntersectingObject(iceCream.class));

        }
    }

    public int getScore()
    {
        return Score;
    }

    public void scoring()
    {
        if (isTouching(Garbage.class))
        {
            Score+=1;
        }
        else  if (isTouching(iceCream.class))
        {
            Score+=-1;
        }
    }

}
