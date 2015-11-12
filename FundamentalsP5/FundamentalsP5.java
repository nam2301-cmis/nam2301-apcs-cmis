
public class FundamentalsP5
{
   public static void main(String[] args)
    {
        String[] myMovie = {"Despicable Me", "Intouchables","Up"};
        for(int index = 0;index< myMovie.length; index++ )
        {
            System.out.println(myMovie[index]+"\n"+"\n");
        }
        
       System.out.println("\n"+"\n");
       String[] mySong= {"Wi ing Wi ing", "Sleepless", "Fear"};
       int num= 0;
       
       while (num< mySong.length-1)
       {
           System.out.print(mySong[num]+",");
           num++;
       }
       System.out.print(mySong[mySong.length-1]);
    }
}
