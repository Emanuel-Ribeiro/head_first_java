class DrumKit
{
  boolean TopHat = true;
  boolean snare = true;
  
  void playTopHat()
  {
    System.out.println("ding ding da-ding");
  } //fim do metodo

  void playSnare()
  {
    System.out.println("bang bang ba-bang");
  } //fim do metodo

} //fim da classe

class DrumKitTestDrive {
  public static void main(String[] args) 
  {

    DrumKit d = new DrumKit();

    d.playSnare();
    d.snare = false;
    d.playTopHat();

    if(d.snare == true)
    {
      d.playSnare();
    } //fim do if
  } //fim do main
} //fim da classe principal
