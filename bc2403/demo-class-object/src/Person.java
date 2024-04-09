public class Person {
  
  private int age; // raw data

  private double salary;

  //constructor
  public Person () {}
  public Person(int age) {
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }

  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }

  public boolean isElderly() { // private boolean isElderly; don't write this, isElderly is not raw data
    return this.age >= 65;
  }

  public boolean isJoyYou() {
    if (this.age >= 60 && salary < 100000 || this.age >= 65) {
      return true;
    } 
    return false;
  }

  public String toString() {
    return "(Person(" //
      + "age: " + this.age //
      + ")"; //
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(65);
    person.setSalary(800.0d);
    System.out.println(person.isElderly()); //true
    System.out.println(person.isJoyYou()); 

    Person person2 = new Person();
    person2.setAge(64);
    person2.setSalary(120000.0d);
    System.out.println(person2.isElderly()); //false    
    System.out.println(person2.isJoyYou());   
    System.out.println(person2.toString());  

    Person person3 = new Person(3);
    System.out.println(person3.getAge());
    System.out.println(new Person(68).isElderly());
    


  }
}
