import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChocalateCus extends actor
{
    /**
     * Act - do whatever the Customer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       scoring();
        getScore();
        kill();
    }    
int Score=0;
public int getScore()
{
    return Score;
}
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
    public void scoring()
    {
        if (isTouching(Chocalate.class))
        {
           Score+=1;
        }
       else  if (isTouching(Garbage.class)||isTouching(Strawberry.class)||isTouching(Vanilla.class))
        {
            Score+=-1;
        }
    }

}
