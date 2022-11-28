import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Author.fName);
        String fName = scanner.nextLine();

        System.out.println(Author.lName);
        String lName = scanner.nextLine();

        System.out.println(Author.aCountry);
        String country = scanner.nextLine();

        System.out.println(Author.isAAlive);
        boolean isAlive = scanner.nextLine().toLowerCase().startsWith("y");

        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Author> authorsList = new ArrayList<>();

        String enterInfo;

        if ( isAlive){
            System.out.println(Author.aAge);
            int age = scanner.nextInt();
            scanner.nextLine();
        }
        do {
            System.out.println(Book.bookInfo);
        enterInfo = scanner.nextLine();
            if (enterInfo.toLowerCase().equals("y")){
                System.out.println(Book.bookName);
                String bookName = scanner.nextLine();
                System.out.println(Book.bGenre);
                String genre = scanner.nextLine();
                System.out.println(Book.pageCount);
                int pageCount = scanner.nextInt();
                scanner.nextLine();

                Book books = new Book(bookName, genre, pageCount);

                bookList.add(books);
            }
            else System.out.println("THE END OF RESULTS OF ABOVE PROGRAM");

        } while (enterInfo.equalsIgnoreCase("y"));

        int age = 0;
        Author author = new Author(fName,lName,country,isAlive,age,bookList);
        authorsList.add(author);

        System.out.println("Author's information = " + author);

        System.out.println("Author's book are as listed below: ");

        for (Book b : bookList) {
            System.out.println(b);

        }


        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE


    }
}
