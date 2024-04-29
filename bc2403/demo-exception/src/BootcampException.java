public class BootcampException extends Exception {
  // extends Exception" implies "BootcampException" is a checked exception
  // because Exception.class is a checked exception

  // public static void main(String[] args) throws BootcampException { // throw exception to JVM, ERROR
    public static void main(String[] args) throws BootcampException {
try {
    calculate(10,2);
    System.out.println("End of Calculate() method");
  } catch (BootcampException e) {
    System.out.println("Exception in calculate() method, revovery stop ...");
  } finally {
    System.out.println("finally...");
  }





    }

  public static int divide(int x, int y) {
    return x / y;  //JVM will throw an object of ArithmeticException
  }

  public static void calculate(int x, int y) throws BootcampException {
    try {
      divide(x, y);
    } catch (ArithmeticException | IllegalArgumentException e) {
      throw new BootcampException();
      //becuase it is achecked exception, so we have to handle it before compilation
    }
  }
}


