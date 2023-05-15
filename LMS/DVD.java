public class DVD extends libraryItem {

    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "DVD Title: " + title + ", Release Year: " + releaseYear +  ", Director: " + director + ", Duration: " + duration;
    }
}