package session10_objects;

public class BookCopy {
    private boolean borrowed;

    public boolean isAvailable() {
        return !borrowed;
    }

    public boolean borrow() {
        if (borrowed) {
            return false;
        }

        borrowed = true;
        return true;
    }

    public void returnBook() {
        borrowed = false;
    }
}
