public class demoStaticMethod {
    public static void main(String[] args) { // main is method name
        // static method
        // void is a exit, the ouput type of method, should be same as declaration
        // void is a return type, representing it must not return anythin.
        // method decrease the duplicate coding

        // method can call mehotd
        int result = sum(1, 3);
        int result2 = sub(3, 1);
        System.out.println(result2);
        double result3 = sum(1.3, 1.4);

        // radius, area
        double area = area(3.2d);
        System.out.println(area);
        double area2 = area("Circle", 3.2d);
        double area3 = area("Square", 3.2d);
        System.out.println(area2);
        System.out.println(area3);
        double area4 = calculate("Circle", "area", 3.2d);
        double area5 = calculate("Square", "area", 3.2d);
        double perimeter1 = calculate("Circle", "perimeter", 3.2d);
        double perimeter2 = calculate("Square", "perimeter", 3.2d);
        System.out.println(area4);
        System.out.println(area5);
        System.out.println(perimeter1);
        System.out.println(perimeter2);

        System.out.println(charA('A','a'));
        System.out.println(charB('y','a'));
        System.out.println(charC('y','a'));
        // Adult
        int age = 18;

        if (age >= 18) {

        }
        boolean isAdult = isAdult(age);
        System.out.println(isAdult);
    }

    public static int sum(int x, int y) { // sum is other method

        // static method
        // "sum" is a method name
        // "(intx , int y)" is declaration of input parameters for methods
        // "int" is a retrun type.
        // keyword "return" : for all non-void scenario
        int z = x + y;
        return z;
    }

    // subtraction
    public static int sub(int x, int y) {
        // int z = x - y;
        return x - y; // int value - int value = int value
    }

    // Method Definition: Method Name + Input Parameter (type & no. of parameter)
    // public static int sum(double x, double y) { // sum is other method
    // return (int) (x + y); // double value + double value = double value
    // }
    public static double sum(double x, double y) { // sum is other method
        return x + y;
    }

    public static double sum(double x, int y) { // sum is other method
        return x + y;
    }

    public static double sum(int x, double y) { // sum is other method
        return x + y;
    }

    // object can not use operator in comparsion
    public static int sum(String x, String y) {
        // Integer z = Integer.valueOf(x) + Integer.valueOf(y); // convert String to Integer
        // //Integer.valueOf(x).intValue() + Integer.valueOf(y).intValue();
        // //Integer Object -> int
        // return z; //unbox: Integer -> int
        return Integer.valueOf(x) + Integer.valueOf(y); // integer + integer -> unbox -> int + int -> int
    }

    public static double area(double radius) {
        return (radius * radius * Math.PI); // Math.PI = 3.14 //bug: double 運算可能有精度損失
    }

    public static double area(String type, double radius) {
        double area = -1.0;
        if ("Circle".equals(type)) {
            area = (radius * radius * Math.PI);
        } else if ("Square".equals(type)) {
            area = (radius * radius);
        }
        return area;
    }

    public static double area2(String type, double radius) {
        if ("Circle".equals(type)) {
            return (radius * radius * Math.PI);
        } else if ("Square".equals(type)) {
            return (radius * radius);
        }
        return -1; // if does not including all conditino, so create a return fullfill all condition
    }

    public static double calculate(String type, String datatype, double x) {
        if ("Circle".equals(type)) {
            if ("area".equals(datatype)) {
                return (Math.pow(x, 2) * Math.PI); // Math.pow(double,double), the result is double
            } else if ("perimeter".equals(datatype)) {
                return (x * 2 * Math.PI);
            }
        }
        if ("Square".equals(type)) {
            if ("area".equals(datatype)) {
                return (x * x);
            } else if ("perimeter".equals(datatype)) {
                return (x * 4);
            }
        }
        return -1.0d;
    }

    public static boolean isAdult(int age) {
        //Approach 1:
        // if (age >= 18)
        //  return true;
        // return false;
        // Approach 2:
        // return age >= 18 ? true : false;
        //Approach 3:
        return age >= 18; // it default return ture if fullfill condition, false if not
    }

    public static String charA(char a, char b) {
        Character x = Character.valueOf(a);
        Character y = Character.valueOf(b);
        String abc = Character.toString(x + y); //?  char + char = int of char + int of char
        return abc;
    }
    public static String charC(char a, char b){
        String abc = "" + 'a' + 'b';
        return abc;
    }
    public static String charB(char a, char b){
        String x = String.valueOf(a);
        String y = String.valueOf(b);
        String abc = x+y;
        return abc;
    }
}
