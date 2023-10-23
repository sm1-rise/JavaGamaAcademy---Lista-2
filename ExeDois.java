public class ExeDois {

  public static void main(String[] args) {
    ImparPar(2);
    ImparPar(3);
  }

  public static void ImparPar(int num) {
    if (num % 2 == 0) System.out.println("Par"); else System.out.println(
      "Impar"
    );
  }
}
