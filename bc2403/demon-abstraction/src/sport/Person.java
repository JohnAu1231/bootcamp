package sport;

public class Person implements Action{
  

  @Override
  public void run() {
    System.out.println("Person is running...");
  }

  @Override
  public void walk() {
    System.out.println("Person is walking...");
  }

  // you can still override the default method in Interface
  @Override
  public void swim() {
    System.out.println("Person is swimming...");
  }

  public void cry() {
    System.out.println("Person is crying...");
  }

  public static void main(String[] args) {
    Action a = new Person();
    //a.cry(); // compile error, Action type does not have cry() method;
    Person p = null;
    if (a instanceof Person) {
      p = (Person) a; // downcast
      p.cry();
    }
    p.cry();
  }
}
