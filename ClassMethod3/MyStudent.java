public class MyStudent 
{
    //instances 
    private String first;
    private String last;
    private double[] ClassGrades;
    private double GradeEnglish;
    private double GradeMath;
    private double GradeScience;
    private double GradeFineArts;
    private double GradeSocialScience;
    
    //zero argument
    public MyStudent()
    {
        first = new String("Chanipa");
        last = new String("Sangphet");
        ClassGrades =new double[5];
    }
    
    //multi arguments
    public MyStudent(String first, String last,double GradeEnglish, double GradeMath, double GradeScience, double GradeFineArts, double GradeSocialScience)
    {
        this.first=new String(first);
        this.last=new String(last);
        this.ClassGrades = new double[5]; // creates an array with no info in it.
        this.ClassGrades[0] = GradeEnglish;
        this.ClassGrades[1] = GradeMath;
        this.ClassGrades[2] = GradeScience;
        this.ClassGrades[3] = GradeFineArts;
        this.ClassGrades[4] = GradeSocialScience;
        
    }
    
    public double CalcGPA()
    {
        double total = 0.0;
        
        for(int index=0; index<ClassGrades.length;index++)
        {
            //total= total + ClassGrades[index];
            total +=ClassGrades[index];//short form
        }
        total/= ClassGrades.length;//short form
        
        return total; 
        
    }//end method CalcGPA
    
    //set the GPA
    public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.ClassGrades[0]=English;
        this.ClassGrades[1]=Math;
        this.ClassGrades[2]=Science;
        this.ClassGrades[3]=FineArts;
        this.ClassGrades[4]=SocialScience;
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA "+ CalcGPA();
        return output;
    }
    
}

