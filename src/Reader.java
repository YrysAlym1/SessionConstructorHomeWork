import java.time.LocalDate;

public class Reader {
    String fullName;
    String  library;
    int cardNumber;
    LocalDate dateOfBirth;
    int phoneNumber;

    public Reader(){}
    public Reader(String fullName,String library,int cardNumber, LocalDate dateOfBirth,int phoneNumber){
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int  libraryNumber){
        System.out.println(this.fullName + " взял " + libraryNumber + " книги ");
    }

    public void returnBook(int  libraryNumber){
        System.out.println(this.fullName + " вернул " + libraryNumber + " книги ");

    }
}
