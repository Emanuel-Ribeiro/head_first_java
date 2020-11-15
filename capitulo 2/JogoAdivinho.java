public class JogoAdivinho 
{
  Jogador j1;
  Jogador j2; //variaveis de instancia para o objeto Jogador
  Jogador j3;

  public void iniciaJogo()
  {
    j1 = new Jogador();
    j2 = new Jogador(); //cria 3 objetos jogador e atribui a eles as 3 variaveis de instancia
    j3 = new Jogador();

    int palpitej1 = 0;
    int palpitej2 = 0; //declara 3 variaveis para armazenar os 3 palpites
    int palpitej3 = 0;

    boolean j1taCerto = false;
    boolean j2taCerto = false; //declara 3 variaveis para armazenar um valor verdadeiro ou falso baseado na resposta do jogador
    boolean j3taCerto = false;

    int numeroAlvo = (int) (Math.random() * 10); //cria o numero a ser adivinhado
    System.out.println("Estou pensando em um número entre 0 e 9...");

    while(true)
    {
      System.out.println("O numero a ser adivinhado é: " + numeroAlvo);

      j1.palpite();
      j2.palpite(); //chama o metodo palpite de cada jogador
      j3.palpite();

      palpitej1 = j1.numero;
      System.out.println("O jogador 1 forneceu o palpite: " + palpitej1);
      
      palpitej2 = j2.numero;
      System.out.println("O jogador 2 forneceu o palpite: " + palpitej2); //obtém o palpite de cada jogador
      
      palpitej3 = j3.numero;
      System.out.println("O jogador 3 forneceu o palpite: " + palpitej3);

      if (palpitej1 == numeroAlvo)
      {
        j1taCerto = true;
      }

      if (palpitej2 == numeroAlvo)
      {
        j2taCerto = true; //verifica o palpite de cada jogador para ver se é igual ao numero alvo, caso um jogador acerte sua variavel será configurada como true (o padrao é false)
      }

      if (palpitej3 == numeroAlvo)
      {
        j3taCerto = true;
      }

      if (j1taCerto || j2taCerto || j3taCerto)
      {
        System.out.println("Temos um vencedor");
        System.out.println("O jogador 1 acertou? " + j1taCerto);
        System.out.println("O jogador 2 acertou? " + j2taCerto);
        System.out.println("O jogador 3 acertou? " + j3taCerto);
        System.out.println("Fim do jogo!");
        break;
      }

      else
      {
        System.out.println("Os jogadores tem de tentar novamente"); //pois nenhum jogador acertou
      } //fim do else
    } //fim do while
  } //fim do método iniciaJogo
} //fim da classe Jogo adivinho

class Jogador
{
  int numero = 0;

  public void palpite()
  {
    numero = (int) (Math.random() * 10);
    System.out.println("Estou pensando em " + numero);
  } //fim do metodo palpite
} //fim da classe jogador

class GameLauncher
{
  public static void main(String[] args) 
  {
    JogoAdivinho jogo = new JogoAdivinho();
    jogo.iniciaJogo();
  } //fim do metodo main
} //fim da classe GameLauncher