public interface Action {
  
  public static Action create(Game game) {
    return game.createAction();
  }
}
