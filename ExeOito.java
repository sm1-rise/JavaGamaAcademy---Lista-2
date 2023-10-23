public class ExeOito {

  public static void main(String[] args) {
    fibo(10);
  }

  private static void fibo(int num) {
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    for (int i = 2; i <= num; i++) {
      n3 = n1;
      n1 = n2;
      n2 = n3 + n2;
      if (n3 == 0) continue;
      System.out.println(n3);
    }
  }
}
