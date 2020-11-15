class Filme
{
  String titulo;
  String genero;
  int avaliacao;

  void iniciarFilme()
  {
    System.out.println("Rodando o filme");
  }
}

class FilmeTestDrive
{
  public static void main(String[] args) 
  {
    Filme um = new Filme ();
    um.titulo = "Foi com o estoque";
    um.genero = "Tragico"; 
    um.avaliacao = -2;

    Filme dois = new Filme ();
    dois.titulo = "Perdidos no cubiculo";
    dois. genero = "Comedia";
    dois.avaliacao = 5;
    dois.iniciarFilme();

    Filme tres = new Filme ();
    tres.titulo = "Clube dos Bytes";
    tres.genero = "Tragico";
    tres.avaliacao = 127;

  }
}
