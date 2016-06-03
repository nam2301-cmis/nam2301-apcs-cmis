import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements Extrapoints
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
     int Score=0;
    
    public int getScore()
    {
        return Score;
    }
    
    public void act() 
    { 
        
        if(Score==20)
        {
            Extrapoints();
         
          } 
     
      int score = ((Trash) getWorld().getObjects(Trash.class).get(0)).getScore();
      int score2 = ((VanillaCus) getWorld().getObjects(VanillaCus.class).get(0)).getScore();
      int score3 = ((ChocalateCus) getWorld().getObjects(ChocalateCus.class).get(0)).getScore();
      int score4 = ((StrawberryCus) getWorld().getObjects(StrawberryCus.class).get(0)).getScore();
      int score5 =((Floor) getWorld().getObjects(Floor.class).get(0)).getScore();
      int scores= score + score2 + score3 + score4+score5;
     
       
      setImage(new GreenfootImage("Score : " + scores, 24, Color.WHITE, Color.BLUE));
     
     
    

    } 
    
    public void Extrapoints()
    {
        Score+=10;
    }
}
