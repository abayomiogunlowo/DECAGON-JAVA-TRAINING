package src.main.java.class_activity_6;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private int bookQuantity;

    public Book(int bookId, String bookTitle, String bookAuthor, int bookQuantity) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }
}
