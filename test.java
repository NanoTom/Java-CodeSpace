package LibraryManagementSystem;

public class test {
    public static void main(String[] args) {
        Library lib = new Library("TestLibrary");

        Book book1 = new Book("Title1", "Author1", "111111111");
        Book book2 = new Book("Title2", "Author2", "222222222");
        Book book3 = new Book("Title3", "Author3", "333333333");
        Book book4 = new Book("Title4", "Author4", "444444444");
        Book book5 = new Book("Title5", "Author5", "555555555");
        Book book6 = new Book("Title6", "Author6", "666666666");
        Book book7 = new Book("Title7", "Author7", "777777777");
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        lib.addBook(book6);
        lib.addBook(book7);
        System.out.println(lib.getBooks());
        lib.borrowBook(book1);
        lib.borrowBook(book3);
        lib.borrowBook(book4);
        System.out.println(lib.getAvailableBooks());
        System.out.println(book3.GetIsAvailable());
        lib.searchBook("title1");
        lib.searchBook("222222222");
        lib.searchBook("author3");
        lib.searchBook("777777777");
        lib.searchBook("132423342425");
        lib.searchBook("125");


        System.out.println("3--------------------------------");
        lib.returnBook(book3);
        lib.returnBook(book4);
        lib.returnBook(book7);
        System.out.println("This is the avialble "+ book3.GetIsAvailable());
        System.out.println(lib.getBooks());
        
    }
}