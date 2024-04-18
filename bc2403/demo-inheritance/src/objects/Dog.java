package objects;

public class Dog {

  private int id;
  
  private Color color;

  public Dog(Color color, int id) {
    this.color = color;
    this.id = id;
  }

  public Color getColor() {
    return this.color;
  }

  public int getId() {
    return this.id;
  }
}
