  class Cachorro
  {
    int tamanho; //Variaveis de instancia
    String raca;
    String nome;

    void latir() //Isso é um metodo
    {
      System.out.println("AU AU AU AU AU");
    }
  }

  class CachorroTestDrive
  {
    public static void main(String[] args) 
    {
      Cachorro c = new Cachorro(); //Crie um objeto Cachorro

      c.tamanho = 40; //Use o operador (.) para configurar o tamanho do objeto Cachorro

      c.latir(); //Chama o metodo latir
    }
  }
