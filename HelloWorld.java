public class HelloWorld {

    public static int plus(int a, int b) {
         return a - b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
         return a * b;
    }

    public static double divide(int a, int b) {
       if (b == 0) throw new ArithmeticException();
    return (double) a / b;

    }

    public static void main(String[] args) {
        System.out.println("Calculator");
    }
}
