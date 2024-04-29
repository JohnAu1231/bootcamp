package cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat extends Animal{
  
  // You have to understand the difference between:
  // 1. <T extends Cat>void addCat3(List<T> cats) -> == List<Cat>
  //2. void addCat(List<? extends Cat> cats) ->  canbe List<Cat> / List<RedCat>
  public static void addCat(List<? super Cat> cats) { // cat or above
    cats.add(new Cat());
    // cats.add(new Animal()); //? compile error, beacause super Cat, canbe list<Animal>/List<Cat>, ERROR when List<Animal>
    cats.add(new RedCat()); //?
  }

  public static void addCat2(List<Cat> cats) { // cat or below

  }

  public static <T extends Cat> void addCat3(List<T> cats) {

  }

  public static void addCat4(List<? extends Cat> cats) {

  }

  public static void main(String[] args) {
    // public static void addCat(List<? super Cat> cats) {
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));    
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));   //????

    // addCat2(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    List<RedCat> rl = new ArrayList<>(List.of(new RedCat(), new RedCat()));

    // addCat2(rl); // Not Ok, compile time chekc -> check type of reference
   addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));
   // because it can be store in List<cat>;

   List<Cat> cats = new LinkedList<>();
    cats.add(new RedCat());
    cats.add(new Cat());
    addCat3(cats);

    // public static <T extends Cat> void addCat3(List<T> cats)
    List<RedCat> redCats = new LinkedList<>();
    addCat3(redCats);

    //public static void addCat4(List<? extends Cat> cats)
    addCat4(cats);
    addCat4(redCats);

    

  }
}
