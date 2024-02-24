package l28;
import java.util.ArrayList;
import java.util.List;
class Bookshelf{

    int indexOfBooks = 0;

    public int indexOfBook = 0;

    public int count = 0;
    public List<Book> books = new ArrayList<>();
    public class Book {


        String title;
        String author;
        int year;
        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;


            indexOfBook = count;
        }
        @Override
        public String toString() {
            return "\n" + title + " by " + author + ", " + year ;
        }
    }
    public void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
        count++;
    }
    public void removeBook(int indexOfBook)
   {
       books.remove(indexOfBook);
       count--;
   }
   public void showBooks()
   {
       System.out.println(books);
   }

   public class Iterator
   {
       boolean changeBook = true;
       void showBook()
       {
               System.out.println(books.get(indexOfBooks));
               //System.out.println(count);

       }
       void nextBook()
       {
           indexOfBooks++;
           if (indexOfBooks == count)
           {
               indexOfBooks = 0;
           }
       }

   }

}
