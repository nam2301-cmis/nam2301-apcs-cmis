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
            System.out.println(aTV.tvType()+" ....Am I on? "+aTV.getTVon());
        }
        
        //false
         for(int i = 0; i < tv.size(); i++)
        {
            tv.get(i).setTVOn(false);
        }
        System.out.println();
        for(TV aTV: tv)
        {
            System.out.println(aTV.tvType() + " Am I on? " + aTV.getTVon() );
        }
        
        System.out.println();
        
        System.out.println(tv1.rotateRabbitEars());
        System.out.println(tv2.connectHDTV());
    }
}