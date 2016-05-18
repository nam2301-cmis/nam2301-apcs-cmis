import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 750, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cone1 cone1 = new cone1();
        addObject(cone1,132,568);
    }

    private int time =100;
    private int time2=100;
    private int count = 1;
    private int count2=1;

    Strawberry a = new Strawberry();
    iceCream    b = new Vanilla();
    iceCream  c = new Chocalate();
    public void act() 
    {

        iceCream[] drop = {a,b,c};
        if(time2 == 0)
        {
            iceCream ch = new Chocalate();

            addObject(drop[(int)(Math.random()*3)], (int) (Math.random( )*250),1);
            time2 = 55;
            count2 = 100;
        }

        if(counter())
        {
            time--;
            count = 1;
        }
        if(counter())
        {
            time2--;
            count2 = 1;
        }
    }    

    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }

}

