public record Person(String name, int age) {
  // record come from java 16

  public static int x = 10;

  public static int getX() {
    return x;
  }
  // you can @Override the default implemented method: getter, equals(), hascode(), toSting()
  @Override
  public String name() {
    return "hello";
  }

  public static void main(String[] args) {


    // No empty constructor
    // only one constructor for all args

    Person p1 = new Person("Vincent", 13);
    Person p2 = new Person("Vincent", 13);
    System.out.println(p1.equals(p2)); // ture
    System.out.println(p1.hashCode() == p2.hashCode()); // true
    System.out.println(p1.toString()); // default

    // getterm skip "get"
    System.out.println(p1.name());
    System.out.println(p1.age());

    // no setter
  }
}
