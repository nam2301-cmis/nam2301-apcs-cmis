public class MyTimeDriver
    {
        public static void main(String[] args)
        {
            MyTime kitchenClock= new MyTime();
            MyTime bedroomClock= new MyTime(15,45,23);
            System.out.println(kitchenClock);
            System.out.println(bedroomClock);
        }//end method main
    }//end class MyTimeDriver