public class Book {
    private String bookId;
    private String bookName;
    private Category category;

    public Book(){

    }

    public Book(String bookId, String bookName, Category category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.category = category;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
