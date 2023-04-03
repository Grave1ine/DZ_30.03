package Task4;

import java.util.LinkedList;

public class AuthorBook extends NameBooks{

   // Book NameBook;
    public LinkedList<Book> NameBook = new LinkedList<>();
    public AuthorBook(String fullName, String ticketNumber, String faculty, String dateOfBirth, String numberPhone) {
        super(fullName, ticketNumber, faculty, dateOfBirth, numberPhone);
    }

    protected void takeBook(int i, Book NameBook){
        this.NameBook.add(NameBook);
    }
}
