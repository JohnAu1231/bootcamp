package mehods;

import java.util.Arrays;

public class Square {
  private int length;

  public Square(int length) {
    this.length = length;
  }

  public void setLength(int length) {
    this.length = length;
  }
  public int getLength() {
    return this.length;
  }

  public int area() {
    return this.length * this.length;
  }

  public static void resize(Square square, int newSize) {
    square.setLength(newSize);
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static String concat(String x, String y) {
    return x + y;
  }

  public static void addOne(short[] arr) {
    // for (short i : arr) {
    //   i += 1;
    // }
    for (int i = 0; i < arr.length; i++) {
      // arr[i] = (short) (arr[i] + 1);
      arr[i]++;
    }
  }

  public static void xxx(Square square) {
    square = new Square(3);
  }



  public static void main(String[] args) {


    // passing copy of value -> primitives, wrapper calsses object, string object
    // passing copy of reference -> all type of array objects, custom class object
    // 
    
    // primitive
    int a = 4;
    int b = 7;
    int r1 = sum(a, b); // passing copy of values of a & b
    // r1 =11

    // wrapper class
    Integer q = 10;
    Integer e = 11;
    int r2 = sum(q, e); // passing copy of values of q & e
    // r2 =21

    // String
    String s1 = "hello";
    String s2 = "world";
    String r3 = concat(s1, s2); // passing copy of values of s1 & s2
    // after concat(), s1 still = "hello" , s2 still = "world"
    // r3 ="helloworld"

    short[] arr1 = new short[] {3, 4, 9};
    addOne(arr1);
    System.out.println(Arrays.toString(arr1));
    //After addOne(), [4, 5 , 10], arr1 is still pointing to the original object

    Square sq1 = new Square(10);
    resize(sq1, 20); // passing copy of reference
    System.out.println(sq1.area()); //400

    Square sq2 = new Square(9);

    xxx(sq2);     // copy of reference in method, pointing a new object, but does not change the original object reference
    System.out.println(sq2.area()); //81

    sq2 = new Square(8); //  in same main, changing the original object reference
    System.out.println(sq2.area()); //64


  

  }

}
