import javax.swing.JOptionPane;
public class Nameandageinput
    {
        public static void main(String[] args)
        {
            int age = 0;
            String input1 = JOptionPane.showInputDialog("Hi!,What's your name?");
           
            String input2 =JOptionPane.showInputDialog("How old are you?");
            System.out.print("Hello, ");
            System.out.print(input1);
            System.out.print(" ! You are ");
            System.out.print(input2);
            int num = Integer.parseInt(input2);
            System.out.println(" years old.");
            
        }
   
    }
