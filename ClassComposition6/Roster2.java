import java.util.ArrayList;
public class Roster2
{
   // private MyStudent[] Students;
    
    ArrayList<MyStudent>Students= new ArrayList<MyStudent>();
    public Roster2()
    {
       Students.add(new("lili",3.99));
    }
    public void addStudent ( MyStudent newStudent ) 
    {
        Students.add(newStudent);
    }

   


}
