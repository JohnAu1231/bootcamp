package abstracts;


public final class SuperCat extends SuperAnimal {

  private int age;

  public SuperCat() {

  }

  public SuperCat(int age, String name) {
    super(name);
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
  @Override
  public void eat() {
    System.out.println("Cat is eating"); 
  }
  @Override
  public void sleep() {
    System.out.println("cat is sleeping");
  }
  @Override
  public void sit() {
    System.out.println("cat is sitting");
  }

  public static void main(String[] args) {
    
    SuperCat cat = new SuperCat(3, "John");
    cat.sleep();
    cat.run();
    cat.eat();
    cat.sit();

  }
}
