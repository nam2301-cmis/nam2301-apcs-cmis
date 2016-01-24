import java.util.ArrayList;
public class ArrayListFam
{
    public static void main (String[] args)
    {
        ArrayList<String> family = new ArrayList<String>();
        family.add("Sirirung");
        family.add("Sa-ne");
        family.add("Nopparat");
        family.add("Mantana");
        family.add("Kanchana");
        System.out.println("The length of the ArrayList is: "+ family.size());
       //Use a for loop to traverse the ArrayList and print the name of each person on a separate line.
        for(int i=0;i<family.size();i++)
        {
            System.out.println(family.get(i));
        }
        
        //Use a separate for-each loop to traverse the ArrayList and print the name of each person on a separate line.
        System.out.println("for-each loop....");
        for (String f: family)
        {
            System.out.println(f);
        }
    }
}