import javax.swing.JOptionPane;

public class Calculations
{
    public static void main(String[] args )
    {
        int add1 = 0;
        int minus1 = 0;
        int multiply1 = 0;
        float divide1 = 0 ;
        int modulo1 = 0 ;
        
        int add2 = 0;
        int minus2 = 0;
        int multiply2 = 0;
        float divide2 = 0 ;
        int modulo2 = 0 ;
        
        String input1 = JOptionPane.showInputDialog("Enter a number!");
        String input2 = JOptionPane.showInputDialog("Enter another number!");
        
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
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
        
        
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(minus1);
        System.out.println(minus2);
        System.out.println(multiply1);
        System.out.println(multiply2);
        System.out.println(divide1);
        System.out.println(divide2);
        System.out.println(modulo1);
        System.out.println(modulo2);
        
        
       
        
        
        
        
    }

}
