import exception.UnknownPlatformException;

public class test {
   
public static void main(String[] args) {
  

  try {
  Game platform = Game.create(PlatFrom.CONSOLE); // new Console object
  Action action = platform.createAction();  // console object .method
  Action.create(platform);    //static method of Action class
  Adventure adventure = platform.createAdventure();
  } catch (UnknownPlatformException e) {
    System.out.println("Unkown Platform");
  }
  
}
}
