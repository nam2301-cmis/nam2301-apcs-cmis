import java.util.ArrayList;

public class AnalogDigitalDriver
{
    public static void main(String[] args)
    {
        BWTV tv1=new BWTV();
        HDTV tv2=new HDTV();
        
        ArrayList<TV> tv=new ArrayList<TV>();
        tv.add(tv1);
        tv.add(tv2);
        
        //true
        for(TV aTV:tv)
        {
            system.out.println(aTV.tvType()+" ....Am I on? "+aTV.getTVon());
        }
        
        //false
         for(int i = 0; i < TV.size(); i++)
        {
            TV.get(i).setTvOn(false);
        }
        System.out.println();
        for(TV aTV: tv)
        {
            System.out.println(aTV.tvType() + " Am I on? " + aTV.getTvOn() );
        }
        
        
        System.out.println(tv1.rotateRabbitEars());
        System.out.println(tv2.connectHDMI());
    }
}