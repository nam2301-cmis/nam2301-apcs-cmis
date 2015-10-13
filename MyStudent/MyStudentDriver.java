import javax.swing.JOptionPane;
public class MyStudentDriver
{
    public static void main(String[] args)
    {
        MyStudent senior001 = new MyStudent();
        JOptionPane.showMessageDialog(null,senior001,"Senior",JOptionPane.PLAIN_MESSAGE);
        MyStudent junior001 = new MyStudent("Vivi","Jita",11,2300,3.5);
        JOptionPane.showMessageDialog(null,junior001,"Junior",JOptionPane.PLAIN_MESSAGE);
    }//end method main
}//end class MyStudentDriver