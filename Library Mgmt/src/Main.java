public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //initialize the library like books and all
        //1.create category
        Category category1 = new Category("1", "Romance");
        Category category2 = new Category("2", "Action");

//        Book book1 = new Book("1", "Kabir Singh", category1);
//        Book book2 = new Book("2", "Avengers", category2);
        
        LibraryController libraryController = new LibraryController();
        libraryController.addBook("1", "king", category1);
        libraryController.addBook("2", "role", category2);
        
        libraryController.removeBook(2);

        libraryController.getAllBooks();
        
    }
}