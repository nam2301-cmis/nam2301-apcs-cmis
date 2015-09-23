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
       int Arrayrandom;
       date=new int[num];
       int min=99;
       int max=-100;
       int sum = 0;
       System.out.println("Day");
       if(num<=0)
       {
           System.out.println("That's not a valid number of days!");
       }
       
       else
       {
           for(int index=1;index<date.length;index++)
           {   
               thisNumber=num;
               date[index] = thisNumber; 
               System.out.println(index);

           }
       }
       for(int i=0;i<date.length;i++)
       {
          Arrayrandom = (int)(Math.random()*200)-100;
          date[i]=Arrayrandom;
          System.out.println(Arrayrandom);
          
          
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
       System.out.println("The minimum temperature was"+min);
       System.out.println("The maximum temperature was"+max);
       System.out.println("The sum temperature was"+sum);
       System.out.println("The average temperature was"+(double)sum/(double)num);
       
   }
}
