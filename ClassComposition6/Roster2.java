import java.util.ArrayList;
public class Roster2
{
   // private MyStudent[] Students;
    
    ArrayList<MyStudent>myStudents= new ArrayList<MyStudent>();
    public Roster2()
    {
       myStudents.add(new MyStudent("LaLa","Collins",3.455));
       myStudents.add(new MyStudent("LuLu","Collins",3.68));
       myStudents.add(new MyStudent("Lily","Collins",3.89));
    }
    
    public void addStudent ( MyStudent newStudent ) 
    {
        myStudents.add(newStudent);
    }

    public void dropStudent ( String lastName ) 
    {
        for(int index = 0 ; index<myStudents.size();index++)
        {
        }
    }

    public String findStudentWithMaxGPA()
    {
        int max = 0;
        for (int i = 0 ; i <myStudents.size();i++)
        {
            if(myStudents.get(i).getGPA()>myStudents.get(max).getGPA())
            {
                max = i;
            }
        }
        return myStudents.get(max).getlastName();
    }
    
    public String toString()
    {
        String output= new String ();
        output = findStudentWithMaxGPA()+" is the one who has the highest GPA."+"\n";
        for(MyStudent x: myStudents)
        {
            output+= x + "\n";
        }
        return output;
    }


}
