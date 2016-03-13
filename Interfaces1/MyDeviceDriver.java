import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        Phone Phone1 =  new Phone();
        Phone Phone2 = new Phone(35,"Chinese","Henry",10);
        ipod ipod1 = new ipod();
        ipod ipod2 = new ipod(38,"Japanese","Pink","Touch");
        MyCar car=new MyCar(55);
       
        ArrayList<Connectable> object = new ArrayList<Connectable>();
        object.add(Phone1);
        object.add(ipod1);
        object.add(Phone2);
        object.add(ipod2);
        object.add(car);
        
        for(Connectable device: object)
        {
            System.out.println(device + "\n");
        }
        
        for(Connectable device:object)
        {
            device.connectToBluetooth();
        }
        
        car.Discountable();
    }
}