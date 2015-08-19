import javax.swing.JOptionPane;

public class Calculations
{
    public static void main(String[] args )
    {
        float add1 = 0;
        float minus1 = 0;
        float multiply1 = 0;
        float divide1 = 0 ;
        float modulo1 = 0 ;
        
        float add2 = 0;
        float minus2 = 0;
        float multiply2 = 0;
        float divide2 = 0 ;
        float modulo2 = 0 ;
        
        String input1 = JOptionPane.showInputDialog("Enter a number!");
        String input2 = JOptionPane.showInputDialog("Enter another number!");
        
        float num1 = Integer.parseInt(input1);
        float num2 = Integer.parseInt(input2);
        
        add1 = num1 + num2;
        minus1 = num1 - num2;
        multiply1 = num1 * num2;
        divide1 = num1 / num2;
        modulo1 = num1 % num2;
        
        
        add2 = num2 + num1;
        minus2 = num2 - num1;
        multiply2 = num2 * num1;
        divide2 = num2 / num1;
        modulo2 = num2 % num1;
        
        
        System.out.println(num1 + " + " + num2 + " = "+ add1);
        System.out.println(num1 + " + " + num2 + " = "+ add2);
        System.out.println(num1 + " - " + num2 + " = "+ minus1);
       System.out.println(num1 + " - " + num2 + " = "+ minus2);
       System.out.println(num1 + " * " + num2 + " = "+ multiply1);
      System.out.println(num1 + " * " + num2 + " = "+ multiply2);
        System.out.println(num1 + " / " + num2 + " = "+ divide1);
       System.out.println(num2 + " / " + num1 + " = "+ divide2);
     System.out.println(num1 + " % " + num2 + " = "+ modulo1);
    System.out.println(num1 + " % " + num2 + " = "+ modulo2);
        
        
       
        
        
        
        
    }

}
