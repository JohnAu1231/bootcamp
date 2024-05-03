public interface Adventure{

  public static Adventure create(Game game) {
    return game.createAdventure();
  }
}