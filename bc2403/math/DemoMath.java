package bc2403.math;

public class DemoMath {

  public static void main(String[] args) {

    int base = 2;
    double result = Math.pow(base, 3); // upcast 1 -> double
    System.out.println(result); // 8.0

    int a = 10;
    int b = 9;
    int min = Math.min(a, b);
    System.out.println(min);
    int max = Math.max(a, b);
    System.out.println(max);

    System.out.println(Math.abs(-3.2));

    System.out.println(Math.round(3.45)); // 3
    System.out.println(Math.round(3.5)); // 4

    System.out.println(Math.sqrt(9.0)); // 3
    System.out.println(Math.sqrt(9.1)); // 3.0166206257996713
    System.out.println(Math.sqrt(-9.0)); // double - > NaN

    System.out.println(Math.ceil(3.1)); // 4.0
    System.out.println(Math.floor(3.8)); // 3.0

    double radian = 3.333;
    double sinValue = Math.sin(radian);
    double cosValue = Math.sin(radian);
    double tanValue = Math.sin(radian);

    int[] arr = new int[] {10, 4, 20 ,3} ;
    int maxx = Integer.MIN_VALUE;

    for (int i =0; i < arr.length; i++) {
      maxx = Math.max (arr[i], maxx);
    }
    System.out.println(maxx);
  }
}
