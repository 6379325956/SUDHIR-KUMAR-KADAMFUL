public class Book {
    
    private String title;
    private String author;
    private int numberOfPages;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.numberOfPages = 0; 
    }

    
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (numberOfPages > 0) {
            System.out.println("Number of Pages: " + numberOfPages);
        } else {
            System.out.println("Number of Pages: Not specified");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Book book1 = new Book("1984", "George Orwell");


        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);


        System.out.println("Book 1 Details:");
        book1.displayInfo();

        System.out.println("Book 2 Details:");
        book2.displayInfo();
    }
}
