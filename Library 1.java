// Abdullah Abouezz 1093358
package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Book> loanedBooks;

    Library(String name) {
        this.name = name;
        this.loanedBooks = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.GetIsAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public void borrowBook(Book book) {
        for (Book WantedBook : books) {
            if (WantedBook.GetTitle().equals(book.GetTitle())) {
                loanedBooks.add(WantedBook);
                WantedBook.SetIsAvailable(false);
            }
        }
    }

    public void returnBook(Book book) {
        if (loanedBooks.size() > 1) {
            boolean IsBorrowed = false;
            for (Book returnedBook : loanedBooks) {
                if (returnedBook.GetTitle().equals(book.GetTitle())) {
                    loanedBooks.remove(returnedBook);
                    returnedBook.SetIsAvailable(true);
                    IsBorrowed = true;
                } else {
                    IsBorrowed = false;
                }
            }
            if (!IsBorrowed) {
                System.out.println("This is not a borrowed book");
            }
        } else if (loanedBooks.size() == 1) {
            if (loanedBooks.get(0).GetTitle().toLowerCase().equals(book.GetTitle().toLowerCase())) {
                loanedBooks.get(0).SetIsAvailable(true);
                loanedBooks.remove(0);
            } else {
                System.out.println("This is not a borrowed book");
            }
        } else {
            System.out.println("There are no borrowed books");
        }
    }

    public void searchBook(String input) {
        boolean IsFound = false;
        for (Book searchedBook : books) {
            if (searchedBook.GetTitle().toLowerCase().equals(input.toLowerCase())
                    || searchedBook.GetAuthor().toLowerCase().equals(input.toLowerCase())
                    || searchedBook.GetISBN().equals(input)) {
                System.out.println("The book is found and these are its info " + searchedBook.GetTitle() + " "
                        + searchedBook.GetAuthor() + " " + searchedBook.GetISBN() + " " + "Availability "
                        + searchedBook.GetIsAvailable());
                IsFound = true;
                break;
            } else {
                IsFound = false;
            }
        }
        if (!IsFound) {
            System.out.println("The Book is not found");
        }
    }
}