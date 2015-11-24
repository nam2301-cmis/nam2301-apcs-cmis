 import javax.swing.JOptionPane;
public class MyTimeDriver
    {
        public static void main(String[] args)
        {
            MyTime Clock = new MyTime();
            Clock.TotalSeconds();
            System.out.println(Clock);
            
            Clock.setTime(1,1,1);
            Clock.TotalSeconds();
            System.out.println(Clock);
            
            Clock.convertDaylightSaving(1);
            Clock.TotalSeconds();
            System.out.println(Clock);
            
            
        }//end method main
    }//end class MyTimeDriver
