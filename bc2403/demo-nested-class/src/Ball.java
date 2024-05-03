public class Ball {
  private Color color;
  private double weight;

  enum Color {
    RED, YELLOW, BLACK;
  }

  private Ball(BallBuilder ballBuilder) {  //private the constructive, must use builder create the Ball object
    this.color = ballBuilder.color;
    this.weight = ballBuilder.weight;
  }

  @Override
  public String toString() {
    return "Ball(" //
    + "Color=" + this.color //
    + ", weight=" + this.weight //
    + ")";
  }

  //Builder Pattern (Coding Pattern)
  // 1. avoid setter, so that I can create ball object with all attributes values
  // 2. avoid all argument constructor
  public static class BallBuilder { //if private, the outside cannot new this object
    private Color color;
    private double weight;

    public BallBuilder setColor(Color color) {    // chain method
      this.color = color;
      return this;
    }

    public BallBuilder setWeight(double weight) {
      this.weight = weight;
      return this;
    }

    public Ball build() {
      return new Ball(this); // this -> BaillBuilder this
    }
  }
//封裝ballbuilder(), new it in the method
  public static BallBuilder builder() {     
    return new Ball.BallBuilder();
  }
  public static void main(String[] args) {

    //Builder Pattern is an alternativvve for creating objects.
    //we no longer use all args constructor.
    Ball ball = new Ball.BallBuilder() // empty constructor of BallBuilder
              .setColor(Color.RED) //  setter
              .setWeight(30.0d) // setter
              .build();      
    System.out.println(ball);

    Ball ball2 =  Ball.builder() // 
    .setColor(Color.RED) //  setter
    .setWeight(30.0d) // setter
    .build(); 
    System.out.println(ball2);
  }
}
