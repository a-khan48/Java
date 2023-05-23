import java.time.LocalDate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("User1", 000);
        User marcus = new User("Marcus", 123);
        User khaled = new User("Khaled", 704);

        Book book1 = new Book("1997 Nissan 240SX Service Manual", 1997, "Nissan Motor Co.", 125, "32987109", "DIY", 0.75);
        Book book2 = new Book("1984", 1949, "George Orwell", 175, "84923041", "Action", 1.00);
        Book book3 = new Book("The Adventures of Captain Underpants", 1997, "Dav Pilkey", 150, "98712510", "Comic", 0.25);
        library.registerUser(user1);
        library.registerUser(marcus);
        library.registerUser(khaled);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        System.out.println(library.findBookWithMostPages());
        System.out.println();

        library.findBookByAuthor("Nissan Motor Co.").forEach(System.out::println);
        System.out.println();

        library.findBookByPublicationYear(1949).forEach(System.out::println);
        System.out.println();

        library.findBookByPageNumber(150).forEach(System.out::println);
        System.out.println();

        library.findBookByCategory("Action").forEach(System.out::println);
        System.out.println();

        library.printTitle();
        System.out.println();


        library.loanBook(user1, book1);
        library.loanBook(user1, book2);
        library.loanBook(marcus, book1);
        library.returnBook(user1, book1);
        library.loanBook(marcus, book1);
        library.returnBook(user1, book2);
        library.returnBook(marcus, book1);
        System.out.println();

        marcus.borrowBook(book1);
        marcus.borrowBook(book2);
        marcus.borrowBook(book3);


        LocalDate today = LocalDate.now();
        LocalDate dueDate1 = today.plusWeeks(2);
        LocalDate dueDate2 = today.minusDays(2);
        book1.setDueDate(dueDate1);
        book2.setDueDate(dueDate2);


        double lateFees = marcus.calculateLateFees();
        System.out.println("User: " + marcus.getName() + " has accrued: $" + lateFees);

        List<Book> overdueBooks = marcus.getOverdueBooks();
        System.out.println( marcus.getName() + "'s overdue books: ");
        overdueBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}
