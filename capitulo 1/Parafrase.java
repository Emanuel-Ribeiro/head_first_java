public class Parafrase 
{
  public static void main(String[] args) 
  {
    String[] wordList1 = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end", "baseado na Web", "difundido", "inteligente", "seis sigma.", "caminho critico", "dinamico"};
    
    String[] wordList2 = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido", "agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado","cooperativo", "acelerado"};

    String[] wordList3 = {"processo", "ponto maximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};

    int comprimentoUm   = wordList1.length;
    int comprimentoDois = wordList2.length;
    int comprimentoTres = wordList3.length;

    int rand1 = (int) (Math.random() * comprimentoUm);
    int rand2 = (int) (Math.random() * comprimentoDois);
    int rand3 = (int) (Math.random() * comprimentoTres);

    String frase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

    System.out.println("Precisamos de " + frase);
  }
}
