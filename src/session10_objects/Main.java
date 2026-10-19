package session10_objects;

public class Main {
    public static void main(String[] args) {
        BookCopy copy = new BookCopy();

        System.out.println("First borrow succeeds: " + copy.borrow());
        System.out.println("Second borrow succeeds: " + copy.borrow());

        System.out.println("Return succeeds: " + copy.returnBook());
        System.out.println("Available after return: " + copy.isAvailable());

        System.out.println("Return already available book: " + copy.returnBook());
        System.out.println("Available after second return: " + copy.isAvailable());

        System.out.println("Borrow after returning succeeds: " + copy.borrow());
    }
}
