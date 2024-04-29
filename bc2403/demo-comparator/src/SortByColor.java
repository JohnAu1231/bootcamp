import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {

public int compare(Ball b1, Ball b2) {
  return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0) ? -1 : 1;
}

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.RED,1.3d));
    balls.add(new Ball(Color.BLACK, 2.0d));
    balls.add(new Ball(Color.YELLOW,7.8d));
    balls.add(new Ball(Color.YELLOW,4.8d));
    balls.add(new Ball(Color.RED,4.3d));
    balls.add(new Ball(Color.BLACK, 3.0d));
    balls.add(new Ball(Color.YELLOW,6.8d));
    balls.add(new Ball(Color.RED,2.3d));

    int random = new Random().nextInt(2);
    Comparator<Ball> formula = null;
    if (random == 1) {
      formula = new SortByColor();
    } else if (random == 0) {
      formula = new SortBySize();
    }
    Collections.sort(balls, formula);  //Open-Close Principle 
    System.out.println(balls);
  
}
      public static Comparator<Ball> getFormula(int num) { // enum better
        if (num == 0) {
          return  new SortByColor();
        } else if (num == 0) {
          return new SortBySize();
        }
        return null;
      }
}
