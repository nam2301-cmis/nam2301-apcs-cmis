import java.util.ArrayList;
public class Roster2
{
   // private MyStudent[] Students;
    
    ArrayList<MyStudent>myStudents= new ArrayList<MyStudent>();
    public void apComputerScience()
    {
      MyStudent x =new MyStudent("LaLa","Collins",3.455);
      MyStudent y =new MyStudent("LuLu","Smith",3.68);
      MyStudent z =new MyStudent("Lily","Lee",3.89);
      
     myStudents.add(x);
     myStudents.add(y);
     myStudents.add(z);
    }
    
    public void addStudent ( MyStudent newStudent ) 
    {
        myStudents.add(newStudent);
    }

    public void dropStudent ( String lastName ) 
    {
        for(int index = 0 ; index<myStudents.size();index++)
        {
            
            if (myStudents.get(index).lastname.equals(lastName))
            {
                myStudents.remove(index);
                index--;
            }
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
