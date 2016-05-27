import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cone1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cone1 extends cone
{
    /**
     * Act - do whatever the cone1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        checkKeys();
        follow();
    }   

    public void follow()
    {
        if(isTouching(Vanilla.class))
        {
            Vanilla v = new Vanilla();
            World myWorld = getWorld();
            myWorld.addObject(v, this.getX(), this.getY());
           // myWorld.removeObject(this.Vanilla);
        }
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("Left") )
        {
            moveLeft();

        }
        if (Greenfoot.isKeyDown("Right") )
        {
            moveRight();

        }
    }

    private int speed = 8;
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }

    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }

}