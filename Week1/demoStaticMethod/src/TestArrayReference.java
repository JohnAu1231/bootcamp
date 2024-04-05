import java.util.Arrays;

public class TestArrayReference {
  public static void main(String[] args) {

    int[] intA = new int[] {50, 4, 100};
    System.out.println(Arrays.toString(intA));
    add(intA);
    System.out.println(Arrays.toString(intA));

    boolean[] boo = new boolean[] {true, false};
    System.out.println(Arrays.toString(boo));
    change(boo);
    System.out.println(Arrays.toString(boo));
  }
  
  public static void add(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] + 2;
    }
  }
  public static void change(boolean[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == true) {
        a[i] = false;
      } else if (a[i] == false) {
        a[i] = true;
      }
    }
  }

  
}
