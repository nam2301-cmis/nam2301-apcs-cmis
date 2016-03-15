import java.util.ArrayList;
public class TelevisionDriver
{
    public static void main(String[] args)
    {
        Plasma plasmatv= new Plasma();
        DLP dlptv=new DLP();
        LCD ldctv=new LCD();
        LED ledtv=new LED();
        
        ArrayList<Television> TV= new ArrayList<Television>();
        TV.add(plasmatv);
        TV.add(dlptv);
        TV.add(ldctv);
        TV.add(ledtv);
        
        System.out.print("TVs in the store....\n");
        for(Television aTV:TV)
        {
            System.out.println(aTV);
        }
    }
}