public class demoWrapper {
    public static void main(String[] args) {

        int x = 1; // +, - ,*, /, %, point the value 1 in Java stack
        // x2,x3 both create a new object
        Integer x2 = 1;// Integer wrapper class -> new object in hemp(i.e. String.class ->String Object)
        Integer x3 = new Integer("1"); //if no new, the 1 same as x2, if has a new, the 1 is a new object

        long y = 1;
        Long y1 = 1L;
        Long y2 = new Long("1");

        short z = 1;
        Short z1 = 1;
        Short z2 = new Short("1");

        byte b = 1;
        Byte b1 = 1;
        Byte b2 = new Byte("1");

        double a = 10d;
        Double a1 = 10d;
        Double a2 = new Double("10.0");

        float f = 10f;
        Float f1 = 10f;
        Float f2 = new Float("10.0");

        boolean e = true;
        Boolean e1 = true;
        Boolean e2 = new Boolean("true");

        char g = 'a';
        Character g1 = 'a';
        Character g2 = new Character('a');

        if (x2.equals(1)) {
            System.out.println("x2=1");
        }

        if (x2 == 1) {
            System.out.println("x2=1");
        }

        x2 = 128;
        if (x2 == 128) {
            System.out.println("x2=128");
        }

        Integer num1 = Integer.valueOf(127); // valueOf() -> new a integer object
        Integer num2 = Integer.valueOf(127); 
        System.out.println(num1 == num2); // true
        System.out.println(num1.equals(num2)); //true
        // "==" is checking if they are same object
        // equals() is checking if they are wtih same value

        Integer num5 = new Integer("127");
        System.out.println(num1 == num5); // false, using "new" to create a new object 127

        Integer num3 = Integer.valueOf(128);
        Integer num4 = Integer.valueOf(128);
        System.out.println(num3 == num4); // false, num3 and num4 are two different objects
        System.out.println(num3.equals(num4)); // true

        // valueOf() will check and use the integer object if it is default created in java
        //-128 to 127 , java default not need to create a new object, default created in hemp
        // this 256 oject already created in java

        //.complareTo()
        int num6 = 126;
        System.out.println(num1.compareTo(num2)); // same = 0
        System.out.println(num1.compareTo(num3)); // samller = -1
        System.out.println(num1.compareTo(num6)); // bigger = 1


        String str = "hello";
        String str2 = "hello";
        System.out.println(str == str2); // true, java default that same string store in same object.
        String str3 = new String("hello");// using "new" to creat a new string object of "hello"
        System.out.println(str == str3); //false
        String str4 = String.valueOf("hello"); // using same object if created, if not create a new
        System.out.println(str == str4); //true
        System.out.println(str.equals(str2)); //true, checking the value
        System.out.println(str.equals(str3)); //true
        System.out.println(str.equals(str4)); //true

        //primitive using "=="
        //primitive can not use method

        // 17 types + array
        Integer i1 = 3; //3 (int value) -> integer Object with value 3 -> auto-box -> assign to integer variable i1
        // i1 has address
        int i2 = i1; // i1 (Integer Object) -> unbox

        Character c2 = 'c'; //autobox, c2 is object, which has address
        char c3 = c2; //unbox

        // auto-box and unbox limit to use in wrapper class and its primitive
        Integer i3 = 10; //10 (int value) -> integer Object with value 10 -> auto-box
        long l4 = i3; // ineger object -> int(unbox) -> long
        // short s4 = i3 // error // integer object -> int(unbox) -> cannot be "short" because un-secure in datatype

        int i5 = 12;
        //Long l5 = i5; //error// int -> long (upcast) -> Long (autobox) // Because Java cannot does two step together

        Boolean t1 = new Boolean("true");
        Boolean t2 = new Boolean("true");
        Boolean t3 = true;
        System.out.println("test----");
        System.out.println(t1 == t2);
        System.out.println(t3 == t2);




    }
}
