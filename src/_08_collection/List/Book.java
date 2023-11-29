package _08_collection.List;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Book : {title : %s, \n author : %s}\n", this.title, this.author);
    }

}
