public class MyCar extends Vehicle 
{
    private int mpg;
    
    public MyCar(int milesPerGallon)
    {
        this.mpg=milesPerGallon;
    }
    
    public MyCar(int passengers,int milesPerGallon)
    {
        super(passengers);
        this.mpg=milesPerGallon;
    }
    
    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for a MyCar");
        
    }
    
    public void Discountable()
    {
        System.out.println("Lucky you!!!! 50% discount");
    }
    
    public String toString()
    {
        return super.toString()+"\n"+
                "Miles per gallon for this car is: "+mpg;
    }
}