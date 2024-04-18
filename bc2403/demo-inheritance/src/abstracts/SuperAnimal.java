package abstracts;

public abstract class SuperAnimal extends SuperObject { // you cannot create an object for SuperAnimal

  private String name;

  public SuperAnimal() { // the abstract class constructor is not for new, is for child class super(constructor)

  }

  public SuperAnimal(String name) {
    this.name = name;
  } // ???

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public final void swim() {   //final method, the child clss cannot override
    System.out.println("Animal is swimming");
  }

  public abstract void eat(); // can no implement // have a method signatrue only
  // the child class has to implement it

  public void sleep() {
    System.out.println("animal is sleeping");
  }

  public void run() {
    System.out.println("animal is running");
  }

  public static void main(String[] args) {
    // SuperAnimal sa = new SuperAnimal();
  }
}
