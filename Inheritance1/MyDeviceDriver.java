import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        Phone Phone1 =  new Phone();
        Phone Phone2 = new Phone(35,"Chinese","Henry",10);
        ipod ipod1 = new ipod();
        ipod ipod2 = new ipod(38,"Japanese","Pink","Touch");
        Laptop laptop1= new Laptop();
        Laptop laptop2= new Laptop(64,"Spanish","Apple",135);
        ArrayList<MyDevice> object = new ArrayList<MyDevice>();
        object.add(Phone1);
        object.add(ipod1);
        object.add(laptop1);
        object.add(Phone2);
        object.add(ipod2);
        object.add(laptop2);
        for(MyDevice x:object)
        {
            System.out.println(x+ "\n");
        }
    }
}