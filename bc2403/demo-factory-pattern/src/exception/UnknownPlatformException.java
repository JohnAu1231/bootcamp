package exception;

public class UnknownPlatformException extends Exception {
  
  public enum Systemcode {
    UNKNOWN(100, "Unknown"),
    ;
    private int code;
    private String desc;
    private Systemcode(int code, String desc) {
      this.code = code;
      this.desc = desc;
    }
    public int getCode() {
      return this.code;
    }
    public String getDesc() {
      return this.desc;
    }
  }

  private int code;

  private UnknownPlatformException(Systemcode syscode) {
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }
public static UnknownPlatformException of(Systemcode syscode) {
    if (syscode == null)
      throw new IllegalArgumentException();
      System.out.println("null");
    return new UnknownPlatformException(syscode);
  }
}
