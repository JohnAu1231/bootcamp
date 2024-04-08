public class Dog {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
    System.out.println(dog.toString()); // "Dog(firstName= John, lastName=Lau, age=8)";"
    System.out.println(dog.fullName());

    Square square = new Square();
    square.setLength(13);
    System.out.println(square.toString());// "Square(length=13)"
    System.out.println(square.area()); // 169

    Dog dog2 = null;
    // dog2.setAge(4); // NPE: null pointer exception
    Dog dog3 = new Dog();
    dog3.setAge(15);
    /*
     * dog3 point dog object -> 
     * dog object has setAge method -> 
     * put 15 int method ->
     * this.age = 15 // this mean dog3 object reference pointing the this object
     */
  }

  private String firstName;
  private String lastName;
  private int age;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() { // only get funtion, we named get-
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    return "Dog(" //
        + "firstName=" + this.firstName //
        + ", lastName=" + this.lastName //
        + ", age=" + this.age //
        + ")";
  }

  public String fullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }
}
