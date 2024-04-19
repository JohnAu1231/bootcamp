import java.util.ArrayList;
import java.util.List;

public class SuperArrayList extends ArrayList<Book> {

private List<Book> books;

public SuperArrayList() {
  this.books = super.subList(0, super.size() - 1);
}

  public void insertHead(Book book) {;
    this.books = super.subList(0, super.size()-1);
    for (array)
    books.set(0, book);
   
  }
}
