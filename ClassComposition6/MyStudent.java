public class MyStudent 
{
    //instances 
    private String name;
    private String lastname;
    private double gpa;
    
    //zero argument
    public MyStudent()
    {
        name = new String("Chanipa");
        lastname= new String("Sangphet");
        gpa = 3.55;
    }
    
    //multi arguments
    public MyStudent(String name,String lastname,double gpa)
    {
        this.name=name;
        this.lastname=lastname;
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