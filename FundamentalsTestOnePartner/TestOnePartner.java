import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class TestOnePartner
{
    public static void main ( String args[])
    {
        String input=JOptionPane.showInputDialog("Enter a number");
        int num=Integer.parseInt(input);// convert string to int
        double [] Array; // empty array for random no.
        Array= new double[num]; //put the input number into the array, creating the lockers the random numbers.
        for(int index=0; index<Array.length; index++ )
        {
            System.out.print(index+":");
            Array[index]=(double)(51*(Math.random()));
            System.out.print(Array[index]);
            System.out.print("\n");
        }//getting the random numbers and the first part
        
        int index=Array.length-1;//start from the last
        while(index>=0)
        {
            int x=(int)Array[index];//get the random number in the index position
            int y=x%2;
            if(y==0)
            {
                System.out.print(index+":");
                for(int i=0;i<x;i++)
                {
                    System.out.print("E");
                }
                System.out.print(Array[index]);
            }
            else
            {
                System.out.print(index+":");
                for(int i=0;i<x;i++)
                {
                    System.out.print("O");
                }
                System.out.print(Array[index]);
            }
            System.out.print("\n");
            index--;
        }
    }
}