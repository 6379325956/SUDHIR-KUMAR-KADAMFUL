// Final class
final class FinalClass {
    // Final variable
    final int finalVariable = 100;

    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method in FinalClass.");
    }
}

// Attempting to extend FinalClass will result in a compile-time error
/*
class SubClass extends FinalClass {
    // This will cause a compile-time error because FinalClass cannot be subclassed
}
*/

public class FinalKeywordDemo {

    // Final variable
    final int instanceVariable = 50;

    // Final method
    public final void display() {
        System.out.println("This is a final method in FinalKeywordDemo.");
    }

    public static void main(String[] args) {
        // Demonstrating final variable
        FinalClass fc = new FinalClass();
        System.out.println("Final variable in FinalClass: " + fc.finalVariable);

        // Demonstrating final method
        fc.finalMethod();

        // Demonstrating final instance variable and method
        FinalKeywordDemo demo = new FinalKeywordDemo();
        System.out.println("Final instance variable in FinalKeywordDemo: " + demo.instanceVariable);
        demo.display();

        // Trying to modify final variable will cause a compile-time error
        // Uncommenting the following line will result in a compilation error
        // demo.instanceVariable = 60; // Compile-time error: cannot assign a value to final variable instanceVariable
    }
}
