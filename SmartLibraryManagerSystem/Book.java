public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    //Constructor
    public Book(int id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //Display book details
    @Override
    public String toString() {
        return "📚 Book ID: " + id +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nGenre: " + genre +
                "\nAvailable: " + (isAvailable ? "Yes" : "No") + "\n";
    }

}
