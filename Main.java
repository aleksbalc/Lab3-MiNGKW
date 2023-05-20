public class Main {
    public static void main(String[] args) {
        int n = 5;
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}