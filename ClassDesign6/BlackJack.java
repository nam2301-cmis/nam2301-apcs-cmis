import javax.swing.JOptionPane;
public class BlackJack 
{
    public static void main(String args[])
    {
        //players and the dealer
        Card Dealer[]= new Card[2];
        Card P1[]=new Card[2];
        Card P2[]=new Card[2];
        Card P3[]=new Card[2];
        Card P4[]=new Card[2];
        Card P5[]=new Card[2];
        
        String rank[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int score[]= {1,2,3,4,5,6,7,8,9,10,10,10,10};
        String suit[]={"♠","♥","♦","♣"};
        //Dealer
        for(int i=0;i<Dealer.length;i++)
        {
            
            Dealer[i]= new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);;
            System.out.println("Dealer "+Dealer[i]);
        }
        
        //Player1
        for(int i=0;i<P1.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P1[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player1 "+P1[i]);
        }
        
        //Player2
        for(int i=0;i<P2.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P2[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player2 "+P2[i]);
        }
        
        //Player3
        for(int i=0;i<P3.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P3[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player3 "+P3[i]);
        }
        
        //Player4
        for(int i=0;i<P4.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P4[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player4 "+P4[i]);
        }
        
        //Player5
        for(int i=0;i<P5.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P5[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player5 "+P5[i]);
        }
        
        
    }//end method
}
