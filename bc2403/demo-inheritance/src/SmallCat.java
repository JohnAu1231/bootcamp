public class SmallCat extends Cat {

  private double weight;

  public SmallCat(int age, String name, double weight) {
    super(age, name);
    this.weight = weight;
  }



  public static void main(String[] args) {

    SmallCat sc = new SmallCat(3, "Ken", 8.0d); // super() -> call cat()
    System.out.println(sc.getAge());
    System.out.println(sc.getAnimalName());
    System.out.println(sc.getCatName());
    System.out.println(sc.getName());
  }
}
