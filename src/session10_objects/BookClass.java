package session10_objects;

public class BookClass {

    public static class Book {
        // Attributes
        private String title;
        private String author;
        private int pages;
        private double price;

        // Constructor
        public Book() {
        }
        // Getter for title
        public String getTitle() {
            return title;
        }

        // Setter for title
        public void setTitle(String title) {
            this.title = title;
        }

        // Getter for price
        public double getPrice() {
            return price;
        }

        // Setter for price
        public void setPrice(double price) {
            this.price = price;
        }

        // Display all information
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Price: " + price);
        }

        // Main method for testing
        public static void main(String[] args) {

            Book book = new Book();

            book.setTitle("Harry Potter");
            book.author = "J.K. Rowling";
            book.pages = 350;
            book.setPrice(199.95);

            book.displayInfo();
        }
    }
}
