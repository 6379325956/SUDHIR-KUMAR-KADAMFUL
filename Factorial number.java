public class Factorial {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Number for which we want to calculate factorial
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
