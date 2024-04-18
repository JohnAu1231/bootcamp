package objects;

public class Person {
  
  private Dog dog;

  public Dog getDog() {
    return this.dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public static void main(String[] args) {
    
    Person vincent =  new Person();
    vincent.setDog(new Dog(Color.Black, 1));;

    Dog vincentDog = vincent.getDog();

    vincent.setDog(new Dog(Color.RED, 1));

    Dog vincentDog2 = vincent.getDog();
    System.out.println(vincentDog2.getColor());

    Person oscar = new Person();
    oscar.setDog(new Dog(Color.Black, 2));

    Dog oscarDog = oscar.getDog();
  }
}
