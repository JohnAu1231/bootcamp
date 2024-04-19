package dice;

public class Player {
  
  public int start() {
    Roll[] dices = new Roll[] {new Dice1(), new FishDice()};
    int sum = 0;
    for (Roll dice : dices) {
      sum += dice.roll();
    }
    return sum;
  }

  public Result start2() {
    Result result = new Result(new Dice1().roll2(), new FishDice().roll2());
    return result;

  }


  public static void main(String[] args) {
    
    Player p = new Player();
    System.out.println(p.start());
    System.out.println(p.start());
    System.out.println(p.start());
    System.out.println(p.start());
    System.out.println(p.start2().toString());
    System.out.println(p.start2().score());
    
  }
}
