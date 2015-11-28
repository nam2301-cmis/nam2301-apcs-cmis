import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main(String[] args)
    {
        
        MyStudent student = new MyStudent("Joe","Senior",4.0,4.0,3.5,4.0,4.0);
        student.CalcGPA();
        System.out.println(student);
        
       
        student.setGPA(4.0,4.0,4.0,4.0,4.0);
        student.CalcGPA();
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver

