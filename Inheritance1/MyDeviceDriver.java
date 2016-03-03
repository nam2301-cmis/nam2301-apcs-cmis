import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        Phone Phone1 =  new Phone();
        Phone Phone2 =  new Phone();
        Phone2.setOwner("Nam");
        Phone2.setVersion(10);
        ipod ipod1 =  new ipod();
      
        Labtop Labtop1 =  new Labtop();
        
        
        ArrayList<MyDevice> object = new ArrayList<MyDevice>();
        object.add(Phone2);
        
        
        for(MyDevice x:object)
        {
            System.out.println(x+ "\n");
        }
    }
}