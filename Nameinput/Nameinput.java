import javax.swing.JOptionPane;

public class Nameinput
    {
        public static void main(String[] args )
        {
            String input =JOptionPane.showInputDialog("Hi!,What's your name?");
            System.out.print("Hello, ");
            System.out.println(input);
        }
    }
