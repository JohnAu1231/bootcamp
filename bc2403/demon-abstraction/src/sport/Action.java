package sport;

public interface Action {
  void run();
  void walk();
  // After Java 8 
  default void swim() {  //instance method by ineriance
    System.out.println("Swim...");
  };

  static void sleep() {   // normal static method
    System.out.println("Static method: sleep...");
  }
}
