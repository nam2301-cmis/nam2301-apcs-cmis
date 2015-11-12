import javax.swing.JOptionPane;
public class SimpleCardDriver
{
    public static void main(String args[])
    {
        SimpleCard  Cards[] = new SimpleCard[52];
        SimpleCard Random[] = new SimpleCard[5];
        String rank[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String suit[]={"♠","♥","♦","♣"};
        
    
    
    for(int i=0;i<Random.length;i++)
    {
        Random[i]= new SimpleCard(rank[(int)(Math.random()*13)],suit[(int)(Math.random()*6)]);
        System.out.println("Random "+Random[i].rank);
    }
    
    
   }
}