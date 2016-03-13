import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        AsteriodMan Strongy = new AsteriodMan();
        Strongy.setSuitColor("Red");
        Strongy.setCape(true);
        Strongy.setName("AsteriodMan");
        FriedEggman Eggy= new FriedEggman();
        Eggy.setSuitColor("Pink");
        Eggy.setCape(false);
        Eggy.setName("Eggman");
        Mangoman Maggie = new Mangoman();
        Maggie.setSuitColor("Blue");
        Maggie.setCape(true);
        Maggie.setName("Mangoman");    
        
        
        ArrayList<SuperHero> hero = new ArrayList<SuperHero>();
        hero.add(Strongy);
        hero.add(Eggy);
        hero.add(Maggie);
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        
        int i =0;
        
        System.out.println("Original set of ArrayList heroes.....");
        for (SuperHero Ahero:hero)
        {
            System.out.println(Ahero);
        }
        
       for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < hero.size())
                {
                    if(hero.get(i).isCaped() == true)
                    {
                        capedHeroes[row][col] = hero.get(i);
                        hero.remove(hero.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }
        
        
         System.out.println("\nPrinting 2D Array capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(capedHeroes[row][col] != null)
                {
                    System.out.print(capedHeroes[row][col].getName() + "\t");
                }
                else
                {
                    System.out.print(capedHeroes[row][col] + "\t");
                }
                i++;

            }
            System.out.println();
        }

        System.out.println("\nPrinting contents of capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
               if(capedHeroes[row][col] != null)
               {
                    System.out.println(capedHeroes[row][col] + "\t");
                    i++;
                }
            }
            System.out.println();
        }

        System.out.println("\nRemaining set of ArrayList heroes...");
        for(SuperHero eachHero: hero)
        {
            System.out.println(eachHero);
        }
    }
}
        
   