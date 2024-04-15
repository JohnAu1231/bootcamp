public class House {
  
  private Direction direction;

  public House(Direction direction) {
      this.direction = direction;
  }

//   public Direction oppsite() {
//     for (Direction d : Direction.values()) {
//         if (this.direction.getValue() * -1 == d.getValue())
//         return d;
//     }
//     return null;
// }

  public void setDirection(Direction direction) {
      this.direction = direction;
  }

  public Direction getDirection() {
    return this.direction;
  } 
}
