import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class iceCream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class iceCream extends Actor implements Dissapear
{
    /**
     * Act - do whatever the iceCream wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX()>0)
        {
            Dissapear();
            Touching();
            Touching2();
        }
    }    

    private int vSpeed = 0;
    private int acceleration = 1;
    public void Touching2()
    {
        if(getWorld()!=null)
        {
            if(isTouching(actor.class))
            {getWorld().removeObject(this);}
        }
    }

    public void Touching()
    {
        if(getWorld()!=null)
        {

            if (isTouching(iceCream.class))
            {
                Actor actor = getOneIntersectingObject(iceCream.class);
                getWorld().removeObject(actor);
            }

            else if(isTouching(Garbage.class))
            {
                Actor actor2 = getOneIntersectingObject(Garbage.class);
                getWorld().removeObject(actor2);
            }
        }

    }

    public void Dissapear()
    {

        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }

    }

    public void checkFall()
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

    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }

    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);

    }
}
