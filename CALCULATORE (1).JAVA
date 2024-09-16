public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    
    public double subtract(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

    
        int int1 = 10;
        int int2 = 5;
        System.out.println("Integer Operations:");
        System.out.println("Add: " + calc.add(int1, int2));
        System.out.println("Subtract: " + calc.subtract(int1, int2));
        System.out.println("Multiply: " + calc.multiply(int1, int2));
        System.out.println("Divide: " + calc.divide(int1, int2));

        
        double double1 = 10.5;
        double double2 = 2.5;
        System.out.println("\nDouble Operations:");
        System.out.println("Add: " + calc.add(double1, double2));
        System.out.println("Subtract: " + calc.subtract(double1, double2));
        System.out.println("Multiply: " + calc.multiply(double1, double2));
        System.out.println("Divide: " + calc.divide(double1, double2));
    }
}
