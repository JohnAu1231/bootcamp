public class BusinessException extends Exception {
  
  private int code;

  private BusinessException(Syscode syscode) {
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode) {
    if (syscode == null)
      throw new IllegalArgumentException();
      System.out.println("test");
    return new BusinessException(syscode);
  }
  public static void main(String[] args) throws BusinessException {
    Exception e = new Exception("login fail");
    BusinessException be = BusinessException.of(null);
    BusinessException be2 = BusinessException.of(Syscode.ID_NOT_FOUND);
    //be is throwable;
    throw be2;
    // System.out.println("test");
  }
}
