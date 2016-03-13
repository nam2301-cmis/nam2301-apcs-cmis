public abstract class Student
{
    private String firstname;
    private String major;
    private int unit;
    
    public Student(String firstname,String major,int unit)
    {
        this.firstname=firstname;
        this.major=major;
        this.unit=unit;
    }
    
    public void setfirstname(String firstname)
    {
        this.firstname=firstname;
    }
    public String getfirstname()
    {
        return firstname;
    }
    
    public void setmajor(String major)
    {
        this.major=major;
        
    }
    public String getmajor()
    {
        return major;
    }
    
    public void setunit(int unit)
    {
        this.unit=unit;
        
    }
    public int getunit()
    {
        return unit;
        
    }
    
    public abstract int calculateTuition(int units);
    
    public String toString()
    {
        String output= new String("");
        output="First name: "+firstname+" Major: "+major+" Units: "+unit;
        return output;
    }
}