public class MyStudent 
{
    //instances 
    private String name;
    String lastname;
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
    
    public String getlastName()
    {
        return this.lastname;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name+" "+ lastname+ "\n"+gpa+"\n";
        return output;
    }
    
}