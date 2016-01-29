public class Roster2Driver 
{
    public static void main (String[] args)
    {
        Roster2 period1 = new Roster2();
        System.out.println("Period1: " + "\n");
        System.out.println(period1);
        System.out.println("after dropping 1 student:" +"\n");
        period1.dropStudent("Collins");
        System.out.println(period1);
    }
}