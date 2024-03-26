public class DataType {
  public static void main(String[] args) {
    // variable 變量
    int x = 3;
    int age = 18;
    System.out.println(x);//3
    x = 200;
    System.out.println(x);//200
    System.out.println("x");//x

    int y =-20;
    y = 100;

    int sum = x + y + age;
    System.out.println(sum); //318

    int price = 8;
    int quantity = 10;
    int total = price * quantity; //80

    int price2 = 10;
    int quantity2 = 4;
    int total2 = price2 * quantity2;//40

    //int 會省略小數,直接除去小數保留整數
    int averagePrice = (total + total2) / (quantity + quantity2); //120/14 = ~8.57
    System.out.println(averagePrice); //8
    int a = 5;
    int b = a / 3;
    System.out.println(b);

    //CamlCase
    //applePie
    //totalPrice
    //Variable don't start from number

    double k = 1.3;
    double k2 = 1.32;
    double k3 = 1;
    double k4 = -100;
    // 至小數點後17個位
    double k5 = 0.321382038120938129472821932139823210382193281309283920183293821037232;
    System.out.println(k5);

    double k6 = 0.1 + 0.2; //expect 0.3
    System.out.println(k6); //0.30000000000000004

    double k7 = 0.2 + 0.3; //0.5
    System.out.println(k7);//0.5

    double k8 = 0.3 - 0.1;//0.2
    System.out.println(k8);//0.19999999999999998

    // % = 餘數
    int u = 10 % 3; //1
    System.out.println(u); //1
    int p = 3 + 9 % 2 * 4 / 2;//5
    System.out.println(p);//5

    int h; //Declaration
    //System.out.println(h);//error
    h = 10;//Initialization
    System.out.println(h);//10

    //byte value is between -128 and 127
    byte b1 = 10;
    byte b2 = 127;
    //byte b3 = 128; // compile time error
    //byte b4 = -129; //compile time error

    //boolean only store Ture or False
    //boolean isTure= 10 //compile error
    boolean isSick = true;

    //short store -32768 to 32767
    short c1 = 30000;
    //short c2 = 35000; //compile error
    //short c3 = -34000; //compile error

    //long store -9223372036854775808 to 922372036854775807  2^63
    //long l1 = 99999999999999999999999999999 // compile error

    //float f1 = 0.4324923482343 //compile error

    //char is 16bit unsigned integer

    //Conversion
    int i1 = 100;
    long l1 = i1;
    long l2 = i1 + 100; // i1 +100 -> =200, and it is int value -> Then change to lone value
    System.out.println(l2);

    //Java ensure type security
    //short s4 = i1; // compile time short does not include all value of int
    //long include all value of int
    short s4 = 10;
    //byte b99 = s4; //compile error, short -> byte  x
    byte b98 = 8;
    short s5 = b98; // short include all value of byte

    //int -> double OK
    int i10 = 888;
    double d10 = i10;
    // double -> int = Compile error
    //double d11 = 3.5;
    //int i11 = d11; //compile error

    //int -> float = OK
    int i12 = 158;
    float f12 = i12;
    //flaot -> int = compile error
    //float f13 = 1.4;
    //int i13 = f13; //comile error
    
    //double -> float = compile error = down grade
    //float f13 = 10.2; //default: 10.2 this value is double value;
    float f13 = 10.2f; // add f in the tail = 10.2f is float value;
    
    double d20 = 10.4; // 10.4 is a double value by default
    double d21 = 10.4d; // explicity assign a double value

    // For integer, Java will check the vaule if it is in range
    // No reason, Java designs this
    // int is default value for integer number
    int z01 = 10; // 10 is a int value by default
    byte b5 = 4; // int 4 , in range of bye, int -> byte, java detect it in compile time

    long l3 = i1; // int -> long
    long l4 = 5; // 5 is int value by default
    //long l5 = 5i; //errr, no ~i ~b ~s (integer, byte, short)
    long l6 = 10000L; // ~L is long value, assign the nubmer be a long value

    //long l7 = 2200000000; //compile error because 2200000000 is integer by default, out of value of integer
    long l8 = 2200000000L; // OK because 2200000000L is assgined to be long value 

    //char
    char c4 = 'a';
    char c5 = '0';
    //char c6 = ''; //compile error
    //char c7 = 'aa'; //compile error

    //boolean
    boolean b6 = true;
    boolean b7 = false;
    // boolean b8 = 'a'; //compile error
    // boolean b9 = 10; //compile error

    //keyword
    // int true = 10;
    // int false = 10;
    // int int = 10;
    // int class = 10;
    // int public = 10;
    // int void = 10;
    // int static = 10;
    int class1 = 10;

    // int h1 = 10 + 300L; // int + long -> 310 long value -> downgrade to int (compile time error)
    Long h2 = 10 + 300L; //int + long -> 310 long value -> store as long value
  }
}