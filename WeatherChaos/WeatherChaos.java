import javax.swing.JOptionPane;
public class WeatherChaos
{
   public static void main(String args[])
   {
       String inputdate=JOptionPane.showInputDialog("Enter a date");
       int num=Integer.parseInt(inputdate);
       int[] date;
       int thisNumber;
       int[] random = new int[200];
       //for random numbers
       int Arrayrandom;
       date=new int[num];
       int min=99;
       int max=-100;
       int sum = 0;
       System.out.println("Day"+"\t"+"temp"+"\t"+"swing"+"\t"+"description");
       if(num<=0)
       {
           System.out.println("That's not a valid number of days!");
       }
       
       else
       {
           for(int index=0;index<=date.length;index++)
           {   
          Arrayrandom = (int)(Math.random()*200)-100;
     
          System.out.println(num+"\t"+Arrayrandom);
        
          if(Arrayrandom<min)
          {
              min = Arrayrandom;
          }
          
          if(Arrayrandom>max)
          {
              max = Arrayrandom;
          }
          
          sum+=Arrayrandom;

           }
       }
       
       for(int i=0;i<date.length;i++)
       {
          
          
       }
       System.out.println("The minimum temperature was "+min);
       System.out.println("The maximum temperature was "+max);
       System.out.println("The sum temperature was "+sum);
       System.out.println("The average temperature was "+(double)sum/(double)num);
       
   }
}
