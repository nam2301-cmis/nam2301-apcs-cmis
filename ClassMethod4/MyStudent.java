public class MyStudent 
{
    //instances 
    private String first;
    private String last;
    private double[] ClassGrades = new double[5];
    private double GradeEnglish;
    private double GradeMath;
    private double GradeScience;
    private double GradeFineArts;
    private double GradeSocialScience;
    private String LetterGPA;

    //zero argument
    public MyStudent()
    {
        first = new String("John");
        last = new String("Doe");
 
        ClassGrades =new double[5];
        ClassGrades[0]=4.0;
        ClassGrades[1]=4.0;
        ClassGrades[2]=4.0;
        ClassGrades[3]=4.0;
        ClassGrades[4]=4.0;
    }

    //multi arguments
    public MyStudent(String first, String last,double GradeEnglish, double GradeMath, double GradeScience, double GradeFineArts, double GradeSocialScience,String LetterGPA)
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

    public String GPAletter()
    {
        if(CalcGPA()>=4.0)
        {
            LetterGPA="A";
        }
        else if(CalcGPA()>= 3.0 && CalcGPA() < 4.0)
        {
            LetterGPA="B";
        }
        else if(CalcGPA()>=2.0 && CalcGPA() < 3.0)
        {
            LetterGPA="C";
        }
        else if(CalcGPA()>=1.0 && CalcGPA()< 2.0)
        {
            LetterGPA="D";
        }
        else
        {
            LetterGPA="F";
        }

        return LetterGPA;
    }//end lettergrade

    public String toString()
    {
        String output = new String();
        output = "First name: " + first+"\n"+"Last name: "+last+"\n"+"Student's average GPA "+ CalcGPA()+"\n" 
        +"John's Grade "+ LetterGPA +"\n"+ClassGrades[0] + " " +ClassGrades[1]+" "+ClassGrades[2]+" "+ClassGrades[3]+" "+ClassGrades[4];

        return output;

    }

}

