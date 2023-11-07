public class TailRecursion {
    public static int factorial(int i) {
        return factorialHelper(i, 1);
    }

    public static int factorialHelper(int i, int result) {
        if (i <= 1) {
            return result;
        } else {
            return factorialHelper(i - 1, i * result);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
