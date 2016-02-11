public class DoctorApp
{
    public static void main(String[] args)
    {
        Doctor[] people = new Doctor[3];
        people[0] = new Doctor("Nathan Kieffer", 1975, 4, 23);
        people[1] = new Doctor("Bradley Shank", 1943, 9, 21, "CMIS");
        people[2] = new Doctor("Tadpole", 1998, 1, 1, "CMIS", "Harvard", true);
        for ( Person person : people )
        {
            System.out.println(person + "\n");
        }     
    }
}