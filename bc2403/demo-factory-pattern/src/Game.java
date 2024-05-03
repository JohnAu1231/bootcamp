import exception.UnknownPlatformException;
import exception.UnknownPlatformException.Systemcode;

public interface Game {
  
    public Action createAction();
    
    public Adventure createAdventure();

   
   
    public static Game create(PlatFrom platForm) throws UnknownPlatformException{ //
     return switch(platForm) {
       case PC -> new Pc();
       case CONSOLE -> new Console();
       case MOBILE -> new Mobile();
       default -> throw UnknownPlatformException.of(Systemcode.UNKNOWN);
    };
   
  
   
   }
   
}
