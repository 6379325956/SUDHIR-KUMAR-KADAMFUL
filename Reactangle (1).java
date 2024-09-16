public class Rectangle {
    // Instance variables
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to check if the current rectangle is equal to another rectangle
    public boolean isEqual(Rectangle rec) {
        return this.length == rec.length && this.width == rec.width;
    }

    // Method to display the dimensions of the rectangle
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(10.0, 5.0);
        Rectangle rect2 = new Rectangle(10.0, 5.0);
        Rectangle rect3 = new Rectangle(7.0, 3.0);

        // Display information about the rectangles
        System.out.println("Rectangle 1:");
        rect1.displayInfo();
        System.out.println("Rectangle 2:");
        rect2.displayInfo();
        System.out.println("Rectangle 3:");
        rect3.displayInfo();

        // Compare rectangles
        System.out.println("\nComparing rectangles:");
        System.out.println("Rectangle 1 is equal to Rectangle 2: " + rect1.isEqual(rect2));
        System.out.println("Rectangle 1 is equal to Rectangle 3: " + rect1.isEqual(rect3));
    }
}
