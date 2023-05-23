import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int pageNumber;
    private String ISBN;
    private String category;
    private boolean isOnLoan;
    private LocalDate dueDate;
    private double lateFee;

    public Book(String title, int releaseYear, String author, int pageNumber, String ISBN, String category, double lateFee) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pageNumber = pageNumber;
        this.category = category;
        this.ISBN = ISBN;
        this.isOnLoan = false;
        this.lateFee = lateFee;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public void setOnLoan(boolean onLoan) {
        isOnLoan = onLoan;
    }

    public double getLateFee() {
        return lateFee;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Release Year: " + releaseYear + ", Author: " + author + ", Number of pages: " + pageNumber + ", ISBN: " + ISBN;
    }
}