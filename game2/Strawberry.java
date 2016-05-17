import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends iceCream
{
      /**
     * Act - do whatever the Chocalate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        super.act();
        checkFall();
        fall();

    }    
    private int vSpeed = 0;
    private int acceleration = 1;

    public void checkFall()
    {
        if(getWorld()!=null)
        {
            if(onGround())
            {
                vSpeed = 0;
            }
            else
            {
                fall();
            }
        }
    }

    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void fall()
    {
        if(getWorld()!=null)
        {
            setLocation(getX(), getY() + vSpeed);
            if(vSpeed <=9)
            {
                vSpeed = vSpeed + acceleration;
            }
        }

    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);

    }
}
