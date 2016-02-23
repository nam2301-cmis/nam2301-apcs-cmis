import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        MyDevice MyDeviceExtend =  new MyDevice();
        
        
        ArrayList<MyDevice> x = new ArrayList<MyDevice>();
        x.add(MyDeviceExtend);
        
        for(MyDevice object:object)
        {
            System.out.println(object+ "\n");
        }
    }
}