public class MySongDriver 
    {
        public static void main(String[] args)
        {
            MySong song1 = new MySong();
            song1.setYearReleased(1999);
            System.out.println(song1);
            
          
           System.out.println(song1); 
            System.out.println("The song is"+song1.convertToMinSec() +"mins long.");
            
            
            
        }// end method main
    }//end class MySongDriver

