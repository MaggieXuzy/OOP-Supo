public class SquareRoot {
  public static double f(double x, double value) {
    return x * x - value;
  }

  public static double df(double x) {
    return 2 * x;
  }

  public static double newtonRaphson(double x0, double value) {
    double x = x0;
    double fx = f(x0, value);
    double dfx = df(x0);
    double delta = 0.0;
    try {
      for (int i = 0; i < 1000; i++) {
        delta = fx / dfx;
        x = x - delta;
        if (delta < 1e-10) {
          return x;
        }
      }
    }
    catch (ArithmeticException e) {
      System.out.println("Derivative is close to zero. Failed.");
    }
    return x;
  }

  public static void main(String[] args) {
    System.out.println(newtonRaphson(1.0, 1.44));
  }
}
