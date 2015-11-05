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
        int Value = 0;
        int ValueD = 0; 
        int Value1 = 0; 
        int Value2 = 0; 
        int Value3 = 0;  
        int Value4 = 0;  
        int Value5 = 0;  
        String dealer;
        String player1;
        String player2;
        String player3;
        String player4;
        String player5;
        
        String rank[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int score[]= {1,2,3,4,5,6,7,8,9,10,10,10,10};
        String suit[]={"♠","♥","♦","♣"};
        //Dealer
        for(int i=0;i<Dealer.length;i++)
        {
            Dealer[i]= new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);;
            System.out.println("Dealer "+Dealer[i]);
            if (Dealer[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (Dealer[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (Dealer[i].rank ==("Q") )
             {
                Value = 10;
            }
            
            else if(Dealer[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (Dealer[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (Dealer[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (Dealer[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (Dealer[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (Dealer[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (Dealer[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (Dealer[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (Dealer[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (Dealer[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (Dealer[i].rank == ("10") )
             {
                Value = 10;
             }     
          ValueD += Value;
           if (Value1>21)
           {
               ValueD=Value-10;
          }//end if for the dealer
          dealer=(Integer.toString(ValueD));
           System.out.print("Dealer's score : "+dealer+ "\n");
        }
        
        //Player1
        for(int i=0;i<P1.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P1[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player1 "+P1[i]);
            if (P1[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (P1[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (P1[i].rank==("Q") )
             {
                Value = 10;
            }
            
            else if(P1[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (P1[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (P1[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (P1[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (P1[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (P1[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (P1[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (P1[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (P1[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (P1[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (P1[i].rank == ("10") )
             {
                Value = 10;
             }     
           Value1 += Value;
           if (Value1>21)
           {
               Value1=Value-10;
          }//end if for p1
          player1=(Integer.toString(Value1));
           System.out.print("Dealer's score : "+player1+ "\n");
        }
        
        
        //Player2
        for(int i=0;i<P2.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P2[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player2 "+P2[i]);
           if (P1[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (P2[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (P2[i].rank==("Q") )
             {
                Value = 10;
            }
            
            else if(P2[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (P2[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (P2[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (P2[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (P2[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (P2[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (P2[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (P2[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (P2[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (P2[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (P2[i].rank == ("10") )
             {
                Value = 10;
             }     
           Value2 += Value;
           if (Value2>21)
           {
               Value2=Value-10;
          }//eng if for p2
          player2=(Integer.toString(Value1));
           System.out.print("Dealer's score : "+player2+ "\n");
        }
        
        
        //Player3
        for(int i=0;i<P3.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P3[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player3 "+P3[i]);
            if (P3[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (P1[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (P3[i].rank==("Q") )
             {
                Value = 10;
            }
            
            else if(P3[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (P3[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (P3[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (P3[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (P3[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (P3[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (P3[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (P3[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (P3[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (P3[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (P3[i].rank == ("10") )
             {
                Value = 10;
             }     
           Value3 += Value;
           if (Value3>21)
           {
               Value3=Value-10;
          }//end if for p3
          player3=(Integer.toString(Value3));
           System.out.print("Dealer's score : "+player3+ "\n");
        }
        
        
        //Player4
        for(int i=0;i<P4.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P4[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player4 "+P4[i]);
           if (P4[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (P4[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (P4[i].rank==("Q") )
             {
                Value = 10;
            }
            
            else if(P4[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (P4[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (P4[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (P4[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (P4[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (P4[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (P4[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (P4[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (P4[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (P4[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (P4[i].rank == ("10") )
             {
                Value = 10;
             }     
           Value4 += Value;
           if (Value4>21)
           {
               Value4=Value-10;
          }// end if p4
          player4=(Integer.toString(Value4));
           System.out.print("Dealer's score : "+player4+ "\n");
        }
        
        
        //Player5
        for(int i=0;i<P5.length;i++)
        {
            int thecard=((int)(Math.random()*13));
            int thesuit=((int)(Math.random()*4));
            P5[i]=  new Card(suit[(int)(Math.random()*3)],rank[(int)(Math.random()*13)]);
            System.out.println("Player5 "+P5[i]);
             if (P5[i].rank == "J" )
             {
                Value = 10;
            }
            else if  (P5[i].rank == ("K") )
             {
                Value = 10;
            }
            
            
            else if (P5[i].rank==("Q") )
             {
                Value = 10;
            }
            
            else if(P5[i].rank==("A"))
            {
                Value = 11;
            }
            
           else if (P5[i].rank == ("1") )
             {
                Value = 11;
            }
            else if (P5[i].rank == ("2") )
             {
                Value = 2;
             }   
            else if (P5[i].rank == ("3") )
             {
                Value = 3;
             }   
           else if (P5[i].rank == ("4") )
             {
                Value = 4;
             }    
           else if (P5[i].rank == ("5") )
             {
                Value = 5;
             }   
            else if (P5[i].rank == ("6") )
             {
                Value = 6;
             }   
           else if (P5[i].rank == ("7") )
             {
                Value = 7;
             }       
             else if (P5[i].rank == ("8") )
             {
                Value = 8;
             }   
            else if (P5[i].rank == ("9") )
             {
                Value = 9;
             }   
           else if (P5[i].rank == ("10") )
             {
                Value = 10;
             }     
           Value5 += Value;
           if (Value5>21)
           {
               Value5=Value-10;
          }//end if p5
          player5=(Integer.toString(Value5));
           System.out.print("Dealer's score : "+player5+ "\n");
        }
        
        
        
    }//end method
}
