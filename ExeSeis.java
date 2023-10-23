public class ExeSeis {

  public static void main(String[] args) {
    palindromo("CARRO");
    palindromo("ana");
  }

  private static void palindromo(String palavra) {
    palavra.toLowerCase();
    String palindromo;
    palindromo = "";
    for (int i = palavra.length() - 1; i >= 0; --i) {
      palindromo = palindromo + palavra.charAt(i);
    }
    if (palavra.equals(palindromo)) System.out.println(
      "Polindromo"
    ); else System.out.println("Não polindromo");
  }
}
