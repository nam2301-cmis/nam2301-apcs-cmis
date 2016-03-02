import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        MyDevice Phone =  new MyDevice();
        
        
        ArrayList<MyDevice> object = new ArrayList<MyDevice>();
        object.add(Phone);
        
        for(MyDevice x:object)
        {
            System.out.println(x+ "\n");
        }
    }
}