public class MyStudent 
{
    //instances 
    private String first;
    private String last;
    private int grade;
    private int id;
    private double gpa;
    
    //zero argument
    public MyStudent()
    {
        first = new String("Chanipa");
        last = new String("Sangphet");
        grade = 12;
        id = 2301;
        gpa = 3.55;
    }
    
    //multi arguments
    public MyStudent(String first, String last, int grade, int id, double gpa)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.grade=grade;
        this.id=id;
        this.gpa=gpa;
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Grade: "+grade+"\n"+"Student ID: "+id+"\n"+"GPA: "+gpa+"\n";
        return output;
    }
    
}