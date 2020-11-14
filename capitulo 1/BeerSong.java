public class BeerSong 
{
  public static void main(String[] args) 
  {
    int beerNum = 99;
    String word = "garrafas";

    while(beerNum != 0)
    {
      
      if (beerNum == 1)
      {
        word = "garrafa";
      }

      System.out.println(beerNum + " " + word + " de cerveja na parede");
      System.out.println(beerNum + " " + word + " de cerveja");
      System.out.println("tire uma");
      System.out.println("passe-a");

      beerNum = beerNum - 1;

      if(beerNum > 0)
      {
        System.out.println(beerNum + " " + word + " de cerveja na parede");
      }

      else
      {
        System.out.println(" Sem mais garrafas na parede!");
      }

    }   
  }
}
