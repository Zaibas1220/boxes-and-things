import java.util.Objects;

public class CD implements ToBeStored{

    private String artist;

    private String title;

    private int publishingYear;

    public CD (String artist, String title, int publishingYear){

        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return publishingYear == cd.publishingYear &&
                Objects.equals(artist, cd.artist) &&
                Objects.equals(title, cd.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, publishingYear);
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
}
