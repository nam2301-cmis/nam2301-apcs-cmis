public class jukeboxDriver
{
   public static void main (String[] args)
   {
       Jukebox PickSong = new Jukebox();
       System.out.println(PickSong);
       System.out.println("Random one: " + PickSong.randomSong());
       System.out.println("Songs with the rating of 5: " + PickSong.playSongofRating(5));
    }
}