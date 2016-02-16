public class MySong
{
    //instance variables
    public String name;
    public int rating; 

    //zero argument
    public MySong()
    {
        name = "Jumper";
        rating = 3;
    } 
    //multi argu
    public MySong(String name, int rating)
    {
       this.name = name;
       this.rating = rating;
    } 
    //toString()
    public String toString()
    {
        String output = new String();
        output =
        "Name: " + name +"\n"+
        "Rating: " + rating+"\n";
        return output;
    }

} // end Song