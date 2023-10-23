public class ExeTres {

  public static void main(String[] args) {
    somaEntreNum(10);
  }

  private static void somaEntreNum(double num) {
    double resultado = 0;
    double soma;
    for (double i = 1; i <= num; ++i) {
      resultado = i + resultado;
      soma = resultado + i;
      System.out.println("Soma entre " + resultado + " + " + i + "= " + soma);
    }
  }
}
