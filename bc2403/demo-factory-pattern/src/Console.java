public class Console implements Game{
  
  @Override
  public Action createAction() {
      System.out.println("Creat a Console Action Game");
      return new ConsoleAction();
  }

  @Override
  public Adventure createAdventure() {
      System.out.println("Creat a Console Adventure Game");
      return new ConsoleAdventure();
  }

}
