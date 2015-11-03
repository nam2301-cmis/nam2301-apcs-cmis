import javax.swing.JOptionPane;
public class BlackJack 
{
    public static void main(String args[])
    {
        //players and the dealer
        String Dealer[]= new String[2];
        String P1[]=new String[2];
        String P2[]=new String[2];
        String P3[]=new String[2];
        String P4[]=new String[2];
        String P5[]=new String[2];
        
        String rank[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int score[]= {1,2,3,4,5,6,7,8,9,10,10,10,10};
        String suit[]={"♠","♥","♦","♣"};
        //Dealer
        for(int i=0;i<Dealer.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            Dealer[i]= rank[i] + suit[i];
            System.out.println(Dealer[i]);
        }
        
        //Player1
        for(int i=0;i<P1.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P1[i]= rank[i] + suit[i];
            System.out.println(P1[i]);
        }
    }//end method
}
