public class ExeSete {

  public static void main(String[] args) {
    vogal("Olá Mundo");
  }

  private static void vogal(String frase) {
    int quantidadeVogal;
    String letra;

    quantidadeVogal = 0;

    for (int i = 0; i <= frase.length() - 1; i++) {
      letra = "";
      letra = letra + frase.toLowerCase().charAt(i);
      if (
        (letra.equals("á")) ||
        (letra.equals("ã")) ||
        (letra.equals("á")) ||
        (letra.equals("â")) ||
        (letra.equals("e")) ||
        (letra.equals("é")) ||
        (letra.equals("ê")) ||
        (letra.equals("i")) ||
        (letra.equals("í")) ||
        (letra.equals("î")) ||
        (letra.equals("o")) ||
        (letra.equals("õ")) ||
        (letra.equals("ó")) ||
        (letra.equals("u")) ||
        (letra.equals("ú")) ||
        (letra.equals("û"))
      ) {
        System.out.println(letra);
        quantidadeVogal++;
      }
    }
    System.out.println("Quantidade vogal: " + quantidadeVogal);
  }
}
