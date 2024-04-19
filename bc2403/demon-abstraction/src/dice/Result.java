package dice;

public class Result {
  
  private Color color;

  private Fish fish;

  public Result(Color color, Fish fish) {
    this.color = color;
    this.fish = fish;
  }

  public void setFish(Fish fish) {
    this.fish = fish;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int score() {
    return fish.getValue() + color.getValue();
  }

  public String toString() {
    return color.toString() + " " + fish.toString();
  }
}
