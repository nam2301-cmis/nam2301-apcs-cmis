public class Roster
{
    private MyStudent[] Students;
    
    //zero-argument
    public Roster()
    {
        this.Students = new MyStudent[3];
        Students[0]= new MyStudent("Lala",3.45);
        Students[1]= new MyStudent("LuLu",3.68);
        Students[2]= new MyStudent("Lily",3.89);
    }
    
    public String findStudentWithMaxGPA()
    {
        int max = 0;
        for (int i = 0 ; i <Students.length;i++)
        {
            if(Students[i].getGPA()>Students[max].getGPA())
            {
                max = i;
            }
        }
        return Students[max].getName();
    }
    
    public String toString()
    {
        String output= new String ();
        output = findStudentWithMaxGPA()+" is the one who has the highest GPA."+"\n";
        for(MyStudent x: Students)
        {
            output+= x + "\n";
        }
        return output;
    }

}
