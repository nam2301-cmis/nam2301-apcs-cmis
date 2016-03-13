public class UnderGrad extends Student
{
    private String firstname;
    private String major;
    private int unit;
    
    public UnderGrad(String firstname,String major,int unit)
    {
        super(firstname,major,unit);
    }
    
    public int calculateTuition(int unit)
    {
        return unit*250; 
    }
    
    public String toString()
    {
        return super.toString();
    }
}