public class libraryApp {
    public static void main(String[] args) {
        libraryManager<libraryItem> library = new libraryManager<>();

        Book bookOne = new Book("1984", 1949, "George Orwell", "84923041");
        Book bookTwo = new Book("1997 Nissan 240SX Service Manual", 1997, "Nissan Motor Co.", "32987109");
        Book bookThree = new Book("The Adventures of Captain Underpants", 1997, "Dav Pilkey", "98712510");

        DVD DVDOne = new DVD("1984", 1984, "Michael Radford", 112);
        DVD DVDTwo = new DVD("BMW - 5 Series (E39) - Video Handbook", 2000, "BMW Motor Co.", 42);
        DVD DVDThree = new DVD("Kidz Bop 16", 2009, "Harry Johnson", 50);


        library.addItem(bookOne);
        library.addItem(bookTwo);
        library.addItem(DVDOne);
        library.addItem(DVDTwo);

        System.out.println("Printing library items, please wait...");
        library.displayItems();

        library.removeItem(bookOne);
        library.removeItem(DVDTwo);

        System.out.println("Printing library items after deletion");
        library.displayItems();



    }
}