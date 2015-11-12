import javax.swing.JOptionPane;
public class SimpleCardApp
{
    public static void main(String args[])
    {
        SimpleCard  Cards[] = new SimpleCard[52];
        SimpleCard Random[] = new SimpleCard[5];
        String rank[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String suit[]={"♠","♥","♦","♣"};  
   
    for(int i=0;i<Cards.length;i++)
    {
        Cards[i]=new SimpleCard(suit[i%suit.length],rank[i%rank.length] );
        System.out.println(Cards[i]);
    }
    
    
    
   }
}