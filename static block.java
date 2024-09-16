public class StaticBlock {
    // Static variable
    static int staticVariable;

    // Instance variables
    int instanceVariable;

    // Static block to initialize static variables
    static {
        staticVariable = 10;
        System.out.println("Static block initialized.");
    }

    // Constructor to initialize instance variables
    public StaticBlock(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    // Method to display the values of variables
    public void displayValues() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Create the first object of StaticBlock
        StaticBlock obj1 = new StaticBlock(20);
        System.out.println("Values for obj1:");
        obj1.displayValues();

        // Update static and instance variables for obj1
        StaticBlock.staticVariable = 30; // Updating static variable
        obj1.instanceVariable = 40; // Updating instance variable for obj1

        // Create the second object of StaticBlock
        StaticBlock obj2 = new StaticBlock(50);
        System.out.println("Values for obj2:");
        obj2.displayValues();

        // Display values for obj1 after updates
        System.out.println("Values for obj1 after updates:");
        obj1.displayValues();
    }
}
