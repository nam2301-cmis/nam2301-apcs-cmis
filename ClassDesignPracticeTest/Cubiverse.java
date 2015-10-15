public class Cubiverse
{
    //instances
    private int numCubiverses;
    private double x,y,z,dfromleft,dfrombottom,dfromback;
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
        dfromleft=x*w;
        dfrombottom=y*h;
        dfromback=z*d;
        name= new String("Default Cubiverse ")+Math.random();
        
        
    }
    
    //multi arguments part A
    public Cubiverse(int w, int h, int d,String name)
    {
        this.w=w;
        this.h=h;
        this.d=d;
        this.name=name;
        x=0.50;
        y=0.50;
        z=0.50;
        dfromleft=x*w;
        dfrombottom=y*h;
        dfromback=z*d;
    }
    
    //multi arguments part B
    public Cubiverse(double x, double y, double z, String name)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=name;
        w=1;
        h=1;
        d=1;
        dfromleft=x*w;
        dfrombottom=y*h;
        dfromback=z*d;
    }
   
    
    public String toString()
    {
        String output=new String();
        output="Name: "+ name+"\n"+
                "w: "+ w +"\n"+
                "h: "+ h +"\n"+
                "d: "+ d +"\n"+
                "volume: "+ w*h*d+ "\n"+
                "x: "+ String.format("%.2f",x) +"\n"+
                "y: "+ String.format("%.2f",y) +"\n"+
                "z: "+ String.format("%.2f",z) +"\n"+
                "distance from left: "+ String.format("%.2f",dfromleft)+"\n"+
                "distance from bottom: "+ String.format("%.2f",dfrombottom)+"\n"+
                "distance from back: "+ String.format("%.2f",dfromback);
        return output;
    }
}