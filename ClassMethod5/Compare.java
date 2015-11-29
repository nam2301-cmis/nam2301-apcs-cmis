public class Compare
{
    public static void main(String[] args)
    {
        String school1 = new String ( "Boston University"); 
        String school2 = new String ( "University of Washington" ); 
        String school3 = new String ( "Purdue University" ); 

        
        System.out.println(school1.compareTo(school2));
        System.out.println(school2.compareTo(school3));
        System.out.println(school3.compareTo(school1));
    }//end method main
    
}
//a. What is the output of the compareTo() method telling us? 
//if its StringA.compareTo(StringB)
//how many letters that String B comes after or before String A, based on the first letter.
//b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case?
//compareTo() will ignore the same first letter and compare the second letters that are different.  