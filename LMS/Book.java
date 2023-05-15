public class Book extends libraryItem {

    String author;
    String ISBN;

public Book(String title, int releaseYear, String author, String ISBN){
    super(title, releaseYear);
    this.ISBN = ISBN;
    this.author = author;
}


    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String getItemDetails() {
        return "Book Title: " + title + ", Release Year: " + releaseYear +  ", Author: " + author + ", ISBN: " + ISBN;
    }
}
