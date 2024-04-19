package dice;

public interface Roll {
  int roll();

  public static void main(String[] args) {

    Roll[] dices = new Roll[] {new Dice1(), new FishDice()};
    int sum = 0;
    for (Roll dice : dices) {
      sum += dice.roll();
    }
    System.out.println(sum);
  }
}


