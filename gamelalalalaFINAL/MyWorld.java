import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World 
{
    Score counter = new Score();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 650, 1); 
        prepare();
       
    }

    public Score getCounter()
    {
        return counter;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MovingWhale whale = new MovingWhale();
        addObject(whale,250,300);
        cone1 cone1 = new cone1();
        addObject(cone1,132,568);
        cone2 cone2 = new cone2();
        addObject(cone2,132,568);

        VanillaCus vanillacus = new VanillaCus();
        addObject(vanillacus,3,300);
        ChocalateCus chocalatecus = new ChocalateCus();
        addObject(chocalatecus,3,500);
        StrawberryCus strawberrycus = new StrawberryCus();
        addObject(strawberrycus,638,500);
        strawberrycus.setLocation(638,500);
        vanillacus.setLocation(3,300);
        chocalatecus.setLocation(3,500);
        Trash trash = new Trash();
        addObject(trash,638,300);
        Score score = new Score();
        addObject(score,19,27);
        score.setLocation(34,30);
        score.setLocation(42,12);

        Floor floor2 = new Floor();
        addObject(floor2,319,746);
    }

    private int time =100;
    private int time2=100;
    private int count = 1;
    private int count2=1;
    private int count3=1;
    private int time3=100;

    Strawberry a = new Strawberry();
    iceCream    b = new Vanilla();
    iceCream  c = new Chocalate();
    Garbage e = new onion();
    Garbage f = new bananaPeal();
    Garbage g = new Hamburger();
    public void act() 
    {

        iceCream[] drop = {a,b,c,a,b,c};
        Garbage[] drop1={e,f,g,e,f,g};

        if(time2 == 0)
        {

            addObject(drop[(int)(Math.random()*6)], ((int) (Math.random( )*500))+60,10);
            time2 = 55;
            count2 = 100;
        }
        if(time3 == 0)
        {
            addObject(drop1[(int)(Math.random()*6)], ((int) (Math.random( )*500))+60,10);
            time3 = 35;
            count3 = 50;
        }

        if(counter())
        {
            time--;
            count = 1;
            time2--;
            count2 = 1;
            time3--;
            count3 = 1;
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
