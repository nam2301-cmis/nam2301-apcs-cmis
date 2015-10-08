import javax.swing.JOptionPane;
public class MyTimeDriver
    {
        public static void main(String[] args)
        {
            int hours =Integer.parseInt(JOptionPane.showInputDialog("What hour is it now ?"));
            int minutes =Integer.parseInt(JOptionPane.showInputDialog("What minutes is it now ?"));
            int seconds =Integer.parseInt(JOptionPane.showInputDialog("What seconds is it now ?"));
            MyTime kitchenClock= new MyTime();
            MyTime bedroomClock= new MyTime(hours,minutes,seconds);
            System.out.println(kitchenClock);
            System.out.println(bedroomClock);
        }//end method main
    }//end class MyTimeDriver