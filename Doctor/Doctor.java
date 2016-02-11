public class Doctor
{
    private String workplace;
    private String name;
    private int worklength;
    private int yob;
    private int mob;
    private int dob;
  
    
    public void Doctor(String name, int yob, int mob, int dob)
    {
        this.name = name;
        this.workplace=workplace;
        this.worklength=worklength;
        this.yob=yob;
        this.mob=mob;
        this.dob=dob;
    }

    public String toString()
    {
        return String.format("Name: %s\nDOB: %s", name,"works at ", workplace," The birth date:", dob+" ", mob+" ", " ",yob);
    }

}