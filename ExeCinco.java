import java.util.Scanner;

public class ExeCinco {

  public static void main(String[] args) {
    sequenciaNumero();
  }

  private static void sequenciaNumero() {
    double varMin = Integer.MAX_VALUE;
    double varMax = Integer.MIN_VALUE;
    double num;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos números deseja informar?: ");
    int numSeq = scanner.nextInt();

    for (int i = 1; i <= numSeq; i++) {
      System.out.println("Informe um numero: ");
      num = scanner.nextDouble();

      if (num < varMin) {
        varMin = num;
      }

      if (num > varMax) {
        varMax = num;
      }
    }

    System.out.println("Maior num: " + varMax);
    System.out.println("Menor num: " + varMin);
    scanner.close();
  }
}
