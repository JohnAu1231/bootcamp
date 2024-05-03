public class Outer {
  private int x = 10;
  private static int y = 100;

  public static int getY() {
    return y;
  }

  public void print() {
    class LocalInner {    // 2b. Locl Inner Class
        int x;
        LocalInner(int x) {
            this.x = x;
        }
        void print() {
            System.out.println("Hello3" + this.x);
        }
    }
    LocalInner li = new LocalInner(20);
    li.print();
  }
 

  static class StaticNested {      //1. static Nested Class (static member of Outer Class)
    void print() {
        System.out.println("Hello" + y);
        //System.out.println("Hello" + x); // cannot access outer object instance variable x
    }
  }
 
  private class Inner {         //2. Inner Class (non-static) (Instance member of Outer Class)
    void print() {
        System.out.println("Hello2" + x);
       //System.out.println("Hello2" + this.x); //not ok, because the x of this -> Outer object
        System.out.println("Hello2" + y);
    }
  }
    
  public static void main(String[] args) {
    Outer o1 = new Outer();
    System.out.println(o1.x); //10

    System.out.println(Outer.y); //100

    Outer.StaticNested o2 = new Outer.StaticNested();
    StaticNested o9 = new StaticNested();
    o9.print();
    o2.print();
    Outer o3 = new Outer();
    Outer.Inner o4 = o3.new Inner();
    Outer.Inner o5 = new Outer().new Inner(); // the inner class object has object address
    // o4.print();
    // o5.print();
    o3.print();

    //before java8 (before lambda)
    Drivable vincent = new Drivable() {
        @Override
        public void drive() {
            System.out.println("I'm driving...");
        }
        @Override
        public void abc() {
            System.out.println("I'm abc...");
        }
    };
    vincent.drive();
    vincent.abc();
  }
}
