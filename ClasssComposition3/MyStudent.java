public class MyStudent 
{
    //instances 
    private String name;
    private double gpa;
    
    //zero argument
    public MyStudent()
    {
        name = new String("Chanipa");
        gpa = 3.55;
    }
    
    //multi arguments
    public MyStudent(String name,double gpa)
    {
        this.name=name;
        this.gpa=gpa;
    }
    
    public double getGPA()
    {
        return this.gpa;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name+"\n"+gpa+"\n";
        return output;
    }
    
}