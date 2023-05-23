import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findBookByPublicationYear(int year) {
        return books.stream()
                .filter(book -> book.getReleaseYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPageNumber))
                .orElse(null);
    }

    public List<Book> findBookByPageNumber(int pages) {
        return books.stream()
                .filter(book -> book.getPageNumber() > pages)
                .collect(Collectors.toList());
    }

    public List<Book> findBookByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public void printTitle() {
        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);
    }

    public void loanBook(User user, Book book) {
        Predicate<Book> isAvailable = books::contains;
        Predicate<Book> isOnLoanToUser = user::isBookOnLoan;

        if (!isAvailable.test(book)) {
            System.out.println("We're sorry! " + book.getTitle() + " is not available!");
        } else if (isOnLoanToUser.test(book)) {
            System.out.println(book.getTitle() + " is on loan to: " + user.getName());
        } else {
            user.borrowBook(book);
            System.out.println(book.getTitle() + " loaned to: " + user.getName());
        }
    }

    public void returnBook(User user, Book book) {
        Predicate<Book> isAvailable = books::contains;
        Predicate<Book> isOnLoanToUser = user::isBookOnLoan;

        if (!isAvailable.test(book)) {
            System.out.println("We're sorry! " + book.getTitle() + " is not available!");
        } else if (!isOnLoanToUser.test(book)) {
            System.out.println(book.getTitle() + " is not on loan to: " + user.getName());
        } else {
            user.returnBook(book);
            System.out.println(book.getTitle() + " has been returned by " + user.getName());
        }
    }
}