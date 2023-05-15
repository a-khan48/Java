public abstract class libraryItem {
    String title;
    int releaseYear;

    public libraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public abstract String getItemType();

    public abstract String getItemDetails();

}
