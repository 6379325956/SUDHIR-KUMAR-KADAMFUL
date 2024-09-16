public class FibonacciSeries {

    // Recursive method to calculate the Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to print Fibonacci series up to a specified number of terms
    public static void printFibonacciSeries(int terms) {
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        // Number of terms in the Fibonacci series to print
        int numberOfTerms = 10;
        printFibonacciSeries(numberOfTerms);
    }
}
