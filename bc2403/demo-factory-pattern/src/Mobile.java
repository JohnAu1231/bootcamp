public class Mobile implements Game {
  
  @Override
  public Action createAction() {
    System.out.println("Creat a Mobile Action Game");
    return new MobileAction();
  }

  @Override 
  public Adventure createAdventure() {
    System.out.println("Creat a Mobile Adventure Game");
    return new MobileAdventure();
  }
}
