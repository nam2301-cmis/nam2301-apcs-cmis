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
    private String A;
    private String B;
    private String C;
    private String D;
    private String F;
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
    
     public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.ClassGrades[0]=English;
        this.ClassGrades[1]=Math;
        this.ClassGrades[2]=Science;
        this.ClassGrades[3]=FineArts;
        this.ClassGrades[4]=SocialScience;
    }
    
    public String getGPA()
    {
     
        if(ClassGrades.equals (4.0))
        {
            return A;
        }
        if(ClassGrades.equals (2.0))
        {
            return B;
        }
        if(ClassGrades.equals (3.0))
        {
            return C;
        }
        if(ClassGrades.equals (1.0))
        {
            return D;
        }
        else
        {
            return F;
        }
    }
    
    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA "+ CalcGPA()+"\n"
                   +"John's Grade "+getGPA()+"\n"+ClassGrades[0] + " " +ClassGrades[1]+" "+ClassGrades[2]+" "+ClassGrades[3]+" "+ClassGrades[4];
        return output;
    }
    
}

