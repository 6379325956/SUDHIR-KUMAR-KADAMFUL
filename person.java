public class Person {
    // Private attributes
    private String name;
    private int age;
    private String emailAddress;

    // Method to set the values of private attributes
    public void setDetails(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    // Method to print the values of private attributes
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email Address: " + emailAddress);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Set values using setDetails method
        person.setDetails("Alice", 30, "alice@example.com");

        // Print details
        System.out.println("Person Details:");
        person.printDetails();

        // Attempt to directly access private attributes (this will cause a compile-time error)
        // Uncommenting the following lines will cause compilation errors
        // person.name = "Bob";  // Compile-time error: name has private access in Person
        // person.age = 35;      // Compile-time error: age has private access in Person
        // person.emailAddress = "bob@example.com";  // Compile-time error: emailAddress has private access in Person
    }
}
