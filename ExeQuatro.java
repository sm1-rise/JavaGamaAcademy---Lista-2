public class ExeQuatro {

  public static void main(String[] args) {
    primo(7);
  }

  private static void primo(int num) {
    int aux = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        ++aux;
      }
    }
    if (aux == 2) {
      System.out.println("Primo");
    } else {
      System.out.println("Não Primo");
    }
  }
}
