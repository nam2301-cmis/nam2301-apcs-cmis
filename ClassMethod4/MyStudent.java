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
    
    public void setGPA(double GradeEnglish, double GradeMath, double GradeScience, double GradeFineArts, double GradeSocialScience)
    {
        this.GradeEnglish=GradeEnglish;
        this.GradeMath=GradeMath;
        this.GradeScience=GradeScience;
        this.GradeFineArts=GradeFineArts;
        this.GradeSocialScience=GradeSocialScience;
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA"+ CalcGPA();
        return output;
    }
    
}

