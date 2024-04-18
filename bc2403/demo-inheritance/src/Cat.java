public class Cat extends Animal {

  // Child class Cat object inherit all instance variables, instance methods from Parent(Super) Class Animal onject
  // But it does not inherit constructor

  private String name;

  private int age;
  //super();  =calling super class's constructor
  public Cat(int age) { // create Animal
    this.age = age;
  }

  public Cat(){
    
  }

  public Cat(int age, String name) {
    super(name);  // using Animal's constructor
    this.age = age;
  }

  // @Override = default, overwrite the super method
  //approach 1
  public void setCatName(String name) {
    this.name = name;
    System.out.println("cat's setName");
  }

  public String getCatName() {
    System.out.println("cat's getName");
    return this.name;
  }

  //approach 2 
  public String getAnimalName() {
    return super.getName();
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void sleep() { //nethod signature is smae as the Animal object sleep()
    System.out.println("sleeping");
  }

  public static void main(String[] args) {

    Cat cat = new Cat(10);
    cat.setName("Jenny");
    System.out.println(cat.getName()); // "jenny"
    cat.sleep();
    cat.setName("John");
    cat.setCatName(("Jenny"));
    System.out.println(cat.getName());
    System.out.println(cat.getCatName());
    System.out.println(cat.getAnimalName());

    // new animal

    // cat has its own instance variable

    // another child class extends animal
  }
}
