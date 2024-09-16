public class Calculator {

    // Method to find the Highest Common Factor (HCF) of variable number of arguments
    public final int findHCF(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        int result = numbers[0];
        for (int num : numbers) {
            result = gcd(result, num);
            if (result == 1) {
                return 1; // The smallest possible HCF
            }
        }
        return result;
    }

    // Helper method to compute GCD of two numbers using Euclidean algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to find the Least Common Multiple (LCM) of variable number of arguments
    public final int findLCM(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        int result = numbers[0];
        for (int num : numbers) {
            result = lcm(result, num);
        }
        return result;
    }

    // Helper method 
