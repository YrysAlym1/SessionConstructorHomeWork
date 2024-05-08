import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Cоздайте  класс  Reader  с  полями
         (fullName,  library(библиотека),
         cardNumber,  dateOfBirth,
         phoneNumber).
         Методы takeBook(), returnBook().
         -  takeBook,  будет  принимать  в
         качестве  параметра  количество
         взятых  книг.  Выводит  на  консоль
         сообщение  "Петров  В.  В.  взял  3
         книги".
         Mетод  returnBook().  Выводит  на
         консоль  сообщение  "Петров  В.  В.
         вернул 3 книги**/


        Reader reader = new Reader("Петров В. В", "A.Osmonov", 1, LocalDate.of(1995, 3, 12), 123);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько книг вы хотите получить?");
        int number = scanner.nextInt();
        reader.takeBook(number);
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("скольно книг вы хотите вернуть?");
            int num = scanner1.nextInt();
            if (number > num || number < num) {
                System.err.println("Вы не выполнили обязанность!");
            }
            if(num == number){
                reader.returnBook(number);
                break;
            }
        }

    }
}