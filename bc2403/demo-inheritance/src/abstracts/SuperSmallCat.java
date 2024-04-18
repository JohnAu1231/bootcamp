package abstracts;

public class SuperSmallCat extends SuperCat { // final class, cannot extend child class
  

  @Override
  public void sit() {
    System.out.println("SmallCat is sitting.");
  }
}
