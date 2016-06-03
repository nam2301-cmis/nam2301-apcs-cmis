import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cone1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cone2 extends cone
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
            myWorld.addObject(v, this.getX(), this.getY()-79);
            getWorld().removeObject(getOneIntersectingObject(Vanilla.class));
        }
        else if(isTouching(Strawberry.class))
        {
            Strawberry s = new Strawberry();
            World myWorld = getWorld();
            myWorld.addObject(s, this.getX(), this.getY()-81);
            getWorld().removeObject(getOneIntersectingObject(Strawberry.class));
        }
        else if(isTouching(Chocalate.class))
        {
            Chocalate c = new Chocalate();
            World myWorld = getWorld();
            myWorld.addObject(c, this.getX(), this.getY()-79);
            getWorld().removeObject(getOneIntersectingObject(Chocalate.class));
        }
        else if(isTouching(onion.class))
        {
            onion o = new onion();
            World myWorld = getWorld();
            myWorld.addObject(o, this.getX(), this.getY()-81);
            getWorld().removeObject(getOneIntersectingObject(onion.class));
        }
        else if(isTouching(bananaPeal.class))
        {
            bananaPeal b = new bananaPeal();
            World myWorld = getWorld();
            myWorld.addObject(b, this.getX(), this.getY()-79);
            getWorld().removeObject(getOneIntersectingObject(bananaPeal.class));
        }
        else if(isTouching(Hamburger.class))
        {
            Hamburger h = new Hamburger();
            World myWorld = getWorld();
            myWorld.addObject(h, this.getX(), this.getY()-79);
            getWorld().removeObject(getOneIntersectingObject(Hamburger.class));
        }
    }

    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("a") )
        {
            moveLeft();

        }
        if (Greenfoot.isKeyDown("d") )
        {
            moveRight();

        }
        if (Greenfoot.isKeyDown("w") )
        {
            moveUp();

        }
        if (Greenfoot.isKeyDown("s") )
        {
            moveDown();

        }
    }

    private int speed = 12;
    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }

    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }

    public void moveUp()
    {
        setLocation ( getX() , getY() - speed);
    }

    public void moveDown()
    {
        setLocation ( getX() , getY() + speed);
    }

}