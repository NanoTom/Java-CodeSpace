// Abdullah Abouezz 1093358
package LibraryManagementSystem;

public class Book {
    private String Title;
    private String Author;
    private String ISBN;
    private boolean IsAvailable;

    Book(String Title, String Author, String ISBN) {
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        IsAvailable = true;
    }
    public void SetTitle(String Title) {
        this.Title = Title;
    }
    public void SetAuthor(String Author) {
        this.Author = Author;
    }
    public void SetISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void SetIsAvailable(boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }
    public String GetTitle() {
        return Title;
    }
    public String GetAuthor() {
        return Author;
    }
    public String GetISBN() {
        return ISBN;
    }
    public boolean GetIsAvailable() {
        return IsAvailable;
    }
}