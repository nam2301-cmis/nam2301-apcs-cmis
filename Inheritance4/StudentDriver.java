import java.util.ArrayList;
public class StudentDriver
{
    public static void main(String[] args)
    {
        UnderGrad undergrad1=new UnderGrad("Ann","Engineer",5);
        UnderGrad undergrad2=new UnderGrad("Bill","Chemistry",3);
        Graduate grad1=new Graduate("Cherry","Economics",6);
        Graduate grad2=new Graduate("Denis","Chinese",5);
        PostGraduate postgrad1=new PostGraduate("Ellis","Mathematics",8);
        PostGraduate postgrad2=new PostGraduate("Fiona","Biology",7);
        
        ArrayList<Student> Astudent=new ArrayList<Student>();
        Astudent.add(postgrad1);
        Astudent.add(postgrad2);
        Astudent.add(grad1);
        Astudent.add(grad2);
        Astudent.add(undergrad1);
        Astudent.add(undergrad2);
    
        Student[][] studentBody= new Student[3][2];
        int i =0;
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                studentBody[row][col] = Astudent.get(i);
                
                i++;
            }
        }
         for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                System.out.print(studentBody[row][col] + "\t\t" );
            }
            System.out.println();
        }
       
    }
}
       
    