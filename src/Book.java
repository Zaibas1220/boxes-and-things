import java.util.Objects;

public class Book implements ToBeStored{

    private String writer;

    private String name;

    private double weight;

    public Book (String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.weight, weight) == 0 &&
                Objects.equals(writer, book.writer) &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, name, weight);
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }
}
