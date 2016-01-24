import java.util.ArrayList;
public class MyPod2Driver
{
    public static void main(String[] args)
    {
       
        MyPod2 carPod = new MyPod2("Mint",128);
        System.out.println(carPod);
        
        //uses an ArrayList to store Songs instead of an array. Provide the same functionality as in Classcomposition4.
       
           ArrayList<String> songs = new ArrayList<String>();
           songs.add("Holding On to You");
           songs.add("Stressed Out");
           songs.add("Magic");
           System.out.println("Using an ArrayList to store Songs instead of an array.");
           System.out.println("The length of the ArrayList is: "+ songs.size());
           //Use a for loop to traverse the ArrayList and print the name of each person on a separate line.
        for(int i=0;i<songs.size();i++)
        {
            System.out.println(songs.get(i));
        }
        
        //Use a separate for-each loop to traverse the ArrayList and print the name of each person on a separate line.
        System.out.println("for-each loop....");
        for (String s: songs)
        {
            System.out.println(s);
        }
       
    }
}//end class