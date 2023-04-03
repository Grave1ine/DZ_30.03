package Task4;

public class NameBooks extends NumberBooksTaken{

    private String[] nameBook;
    public NameBooks(String fullName, String ticketNumber, String faculty, String dateOfBirth, String numberPhone) {
        super(fullName, ticketNumber, faculty, dateOfBirth, numberPhone);
    }

    protected void takeBook(String[] nameBook){
        this.nameBook = nameBook;
        System.out.print(fullName + "взял книги: ");
        for (String s : nameBook) {
            System.out.print(s + ", ");
        }
    }



    public String[] getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = new String[]{nameBook};
    }
}
