public class jukeboxDriver
{
   public static void main (String[] args)
   {
       Jukebox favSongs = new Jukebox();
       System.out.println(favSongs);
       System.out.println("A random song: " + favSongs.randomSong());
       System.out.println("Songs with the rating of 4: " + favSongs.playSongofRating(4));
    }
}