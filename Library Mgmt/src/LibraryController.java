
import java.util.ArrayList;
import java.util.List;

public class LibraryController {

    private List<Book> list;

    public LibraryController() {
        this.list = new ArrayList<>();
    }

    // Add book
    public Book addBook(String bookId, String bookName, Category category) {

        Book newBook = new Book(bookId, bookName, category);
        list.add(newBook);

        return newBook;
    }

    // Remove book
    public boolean removeBook(String bookId) {

        Book book = findBook(bookId);

        if (book == null) {
            return false;
        }

        return list.remove(book);
    }

    // Find book by ID
    public Book findBook(String bookId) {

        return list.stream()
                .filter(b -> b.getBookId().equals(bookId))
                .findFirst()
                .orElse(null);
    }

    // Get all books
    public List<Book> getAllBooks() {

        return new ArrayList<>(list);
    }

}
