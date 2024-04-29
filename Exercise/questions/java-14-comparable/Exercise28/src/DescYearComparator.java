import java.util.Comparator;

public class DescYearComparator implements Comparator<Movies> {
  
  public int compare(Movies m1, Movies m2) {
    if (m1.getYear() > m2.getYear())
      return -1;
    return 1;
  }
}
