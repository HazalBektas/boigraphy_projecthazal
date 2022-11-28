public class Book {

    public Book(String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     * Create a custom constructor that will take 3 args and defines the Book object
     * Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE


    //Define instance variables here
    //YOUR CODE HERE
    public String name;
    public String genre;
    public int totalPage;

public static String bookInfo= "Would you like enter book information? (Y/N)";
public static String bookName = "What is the book name?";
public static String bGenre = "What is genre of the book?";
public static String pageCount = "How many pages does book have?";

    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
