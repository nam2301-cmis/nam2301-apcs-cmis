import javax.swing.JOptionPane;

public class ExtraCredit
{
    public static void  main(String[] args)
    {
        String input=JOptionPane.showInputDialog("Enter a number!");
        int n=Integer.parseInt(input);
        int [] nArray;
        nArray= new int[n];
        int compare;
        int [] tocompare;
       // tocompare= new int[compare];
        
        for(int i=0;i<nArray.length;i++)
          {
            nArray[i]=(int)((n+1)*(Math.random()));
           System.out.print(i+":");
           System.out.print(nArray[i]);
           System.out.print("\n");
           
       }
       
       int i=0;
       while(i<nArray.length)
       {
           int x=nArray[i];
           int y=nArray[i-n];
         if(x>y)
            {
               compare=x;
               for (int index=0;index<x;index++)
               {
                   System.out.print("<");
               }
            }
         else if (x<y)
         {
                compare=y;
                for (int index=0;index<y;index++)
               {
                   System.out.print("<");
               }
         }
         else
         {
             compare=-1;
              System.out.print("-1");
         }
           
          // return compare;
         i--;
       }
      
  }
  
}