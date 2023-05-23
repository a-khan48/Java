import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class User {
    private String name;
    private int libraryCardNumber;
    private List<Book> booksOnLoan;

    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getOverdueBooks() {
        LocalDate today = LocalDate.now();
        return booksOnLoan.stream()
                .filter(book -> book.getDueDate() != null && today.isAfter(book.getDueDate()))
                .collect(Collectors.toList());
    }

    public double calculateLateFees() {
        LocalDate today = LocalDate.now();

        return getOverdueBooks().stream()
                .mapToDouble(book -> {
                    long daysLate = book.getDueDate().until(today).getDays();
                    return daysLate * book.getLateFee();
                })
                .sum();
    }

    public void borrowBook(Book book) {
        booksOnLoan.add(book);
    }

    public void returnBook(Book book) {
        booksOnLoan.remove(book);
    }

    public boolean isBookOnLoan(Book book) {
        Predicate<Book> isOnLoan = this::isBookOnLoanPredicate;
        return isOnLoan.test(book);
    }

    private boolean isBookOnLoanPredicate(Book book) {
        return booksOnLoan.contains(book);
    }
}
