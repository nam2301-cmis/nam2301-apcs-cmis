public class Planet
{
    private int maxPopulation,destroyer,marine;
    private double percentSpaceMarines,percentpop,radius;
    private int maxSpaceMarinesPerStarDestroyer;
    private int nPlanets;
    Planet p;
    //creat arrays for the name and the relationship and then create a code that randomly choose both of them
    //(for the name) Once you get the random name it has to be followed by a random number.
    //public Planet()
    {
        radius=1.00;
        maxPopulation=1;
        percentpop=marine/maxPopulation;
        marine=1;
        destroyer=1;
        maxSpaceMarinesPerStarDestroyer=marine/destroyer;
       // Planet p = Planet p+ Math.random();
    }
    
    public Planet(int maxPopulation,double percentSpaceMarines,int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation=maxPopulation;
        this.percentSpaceMarines=percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer=maxSpaceMarinesPerStarDestroyer;
        radius=Math.random();
        marine=Math.random();
        destroyer=Math.random();
        percentpop=marine/maxPopulation;
        
    }
    public String toString()
    {
        String output=new String();
        output= //"Name: "+Planet p +"\n"+//
                "Relationship: "+"\n"+
                "Radius"+String.format("%.2f",radius)+"\n"+
                "Population:"+maxPopulation+"\n"+
                "Space Marines as percent of Pop.:"+String.format("%.2f",percentpop)+"\n"+
                "Space Marines: "+marine+"\n"+
                "Start Destroyers"+destroyer+"\n"+
                "Space Marines per star destroyer"+String.format("%.2d",maxSpaceMarinesPerStarDestroyer)+"\n";
                
                
        return output;
    }
}
