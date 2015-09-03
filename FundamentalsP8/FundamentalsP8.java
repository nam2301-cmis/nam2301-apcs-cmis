
public class FundamentalsP8
{
    public static void main(String[] args)
    {
        String[] artists = {"Flume","Hyukoh","Bobby"};
        for(int index = 0; index < artists.length; index++)
        {
            System.out.println(artists[index]);
            
        }
        System.out.println("\n");
        artists[(int)(3*Math.random())]= "Michael Jackson";
        for (int index = 0; index < artists.length ; index++)
        {
            System.out.println(artists[index]);
         
        }
        System.out.println("\n");
        for(int index = 0; index < artists.length ; index++)
        {
            if(artists[index].equals("Michael Jackson"))
            {
                System.out.println("We found Michael!");
            }
            else
            {
                System.out.println("No Michael in music["+index+"]");
            }
        }
    }  
}

