
public class MyStudentDriver
{
    public static void main(String[] args)
    {

        MyStudent student = new MyStudent();

        student.CalcGPA();
        student.GPAletter();
        System.out.println(student);

        student.setGPA(4.0,3.0,4.0,4.0,4.0);
        student.CalcGPA();
        student.GPAletter();
        System.out.println(student);
    }//end method main
}//end class MyStudentDriver

