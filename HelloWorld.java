public class HelloWorld {

    public static int plus(int a, int b) {
         return a - b;
    }

    public static int minus(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static int multiply(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static double divide(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
    }
}
