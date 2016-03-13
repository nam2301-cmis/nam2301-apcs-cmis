public abstract class Vehicle implements Connectable, Discountable
{
    private int numPassengers;
    
    public Vehicle()
    {
        this.numPassengers=0;
    }
    
    public Vehicle(int passengers)
    {
        this.numPassengers=5;
    }
    
    public abstract void connectToBluetooth();
    
    public abstract void Discountable();
    
    public String toString()
    {
        return "Number of passengers is: "+ numPassengers;
    }
}
