package Task4;

public class NumberBooksTaken extends Reader{

    private int cuntBook;

    public NumberBooksTaken(String fullName, String ticketNumber, String faculty, String dateOfBirth, String numberPhone){
        super(fullName, ticketNumber, faculty, dateOfBirth, numberPhone);
    }



   protected void takeBook(int cuntBook){
       this.cuntBook = cuntBook;
       System.out.println(fullName + " взял " + cuntBook + " книги");
   }

    public int getCuntBook() {
        return cuntBook;
    }

    public void setCuntBook(int cuntBook) {
        this.cuntBook = cuntBook;
    }
}

