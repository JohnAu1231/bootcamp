import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
  
  private Color color;

  private double size;

  public Ball(Color color, double size) {
    this.color = color;
    this.size = size;
  }

  public double getSize() {
    return this.size;
  }

  public Color getColor() {
    return this.color;
  }

  // @Override
  // public int compareTo(Ball ball) {
  //   return this.size > ball.getSize() ? -1 : 1;
  // }
  // -1 means (this) object move to left
  
  @Override
  public int compareTo(Ball ball) {
    if ( this.color == Color.YELLOW)
      return -1;   // -1 means (this) object move to left
    if ( this.color.name().charAt(0) > ball.getColor().name().charAt(0))
      return -1;
    else if (this.color.name().charAt(0) < ball.getColor().name().charAt(0))
      return 1;
    return this.size > ball.getSize() ? -1 : 1;
  }
  

  @Override
  public String toString() {
    return "Ball(" //
        + "size=" + this.size //
        + ", color=" + this.color //
        + ")";
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
    Collections.sort(balls); // compile time check if the list of the objects implements a contract "Collection"
    // return -1 ( <0) = this向前移
    System.out.println(balls);
  }
  
}
