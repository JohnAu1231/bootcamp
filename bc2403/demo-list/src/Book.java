import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

  private double price;

  private String author;

  public Book(double price, String author) {
    this.price = price;
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.price, this.author);
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.price, book.getPrice()) //
          && Objects.equals(this.author, book.getAuthor());
  }

  @Override
  public String toString() {
    return "Book(" //
          + "price=" + this.price //
          + "author=" + this.author //
          + ")";
  }

  public static void main(String[] args) {
    
    Book[] books = new Book[2];
    books[0] = new Book(10.0d, "John");
    books[1] = new Book (3.7d, "Johnson");

    books[0].getAuthor();

    //ArrayList

    ArrayList<Book> books2 = new ArrayList<>();
    books2.add(new Book(3.4d, "Jenny"));
    books2.add(new Book(2.4d, "Joe"));
    books2.add(new Book(3.7d, "Johnson"));

    System.out.println(books2.size());
    System.out.println(books2.contains(books[1])); // if not Override equals, false // true

    //remove()
    books2.remove(new Book(3.7d, "Johnson"));
    System.out.println(books2.size());
    System.out.println(books2.toString());
    books2.remove(0);
    System.out.println(books2.size());
    System.out.println(books2.toString());

    //set
    books2.add(new Book(4.4d, "HEX"));
    books2.add(new Book(7.7d, "kon"));
    System.out.println(books2.size());
    System.out.println(books2.toString());
    books2.set(0, new Book(20.3, "Oscar"));
    System.out.println(books2.size());
    System.out.println(books2.toString());

    //isEmpty();
    System.out.println(books2.isEmpty()); //false

    //subList()  // endIndex -1
    System.out.println(books2.subList(1,3)); // size = 3,  
    System.out.println(books2.toString());

    System.out.println(books2.get(0));

    books2.clear();
    System.out.println(books2.toString());

    //Initialize with objects
    List<Book> books3 = new ArrayList<>(
              List.of(new Book(10.3d, "Katie"), new Book(20.1d, "Vincent")));

    List<Book> books4 = // List is interface
              List.of(new Book(10.3d, "Katie"), new Book(20.1d, "Vincent"));

    System.out.println(books3.size());
    System.out.println(books4.size());

    books3.add(new Book(10.9d, "Cherry"));
    // books4.add(new Book(10.9d, "Oscar")); // java.lang.UnsupportedOperationException

    for (Book b : books4) {
      System.out.println(b.getPrice() + " " + b.getAuthor());
    }

  }
  
}
