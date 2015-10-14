public class Cubiverse
{
    //instances
    private int numCubiverses;
    private double x,y,z;
    private int w,h,d;
    private String name;
   
    
    //zero argument
    public Cubiverse()
    {
        x = 0.50;
        y = 0.50;
        z = 0.50;
        w = 1;
        h = 1;
        d = 1;
        name= new String("Default Cubiverse");
        //volume = w*h*d;
        
    }
    
    public String toString()
    {
        String output=new String();
        output="Name: "+ name+"\n"+
                "w: "+ w +"\n"+
                "h: "+ h +"\n"+
                "d: "+ d +"\n"+
                "volume: "+ w*h*d+ "\n"+
                "x: "+ x +"\n"+
                "y: "+ y +"\n"+
                "z: "+ z +"\n"+
                "distance from left: "+ x+"\n"+
                "distance from bottom: "+ y+"\n"+
                "distance from back: "+ z;
        return output;
    }
}