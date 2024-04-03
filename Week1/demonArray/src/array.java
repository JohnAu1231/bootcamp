import java.util.Arrays;

public class array {
    public static void main(String[] args) {


        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 50;

        String[] strings = new String[3]; // String array object
        // string store in stack, which is a place to store variable
        // stings can only store string array object, because it is declared on line6
        strings[0] = "abc";
        strings[1] = "hello";
        strings[2] = "xyz";
        // String[3] store in heap, which manage object life cycle
        // string array 入面裝 array address(address = 指向的value )
        // strings[0],strings[1],strings[2], store String, in address[0],[1],[2] in array String[3]
        // String property, string value can not be change in array address, 不是改變原本VAULE,
        // 經原本VAULE再指向新變化VALUE
        strings[0] += "def";
        // reassign a new string into string array address strings[0]
        // address = pointing value
        // array default pointing "null" value
        // abc + edf = abcedf
        // strings[0] -> an address pointing to a String object
        System.out.println(strings[0]);

        strings[1] = strings[2];
        System.out.println(strings[1]);
        // strings[1] pointing the value to strings[2] value

        // back up values
        String[] backup = strings; // assign the address of orignal array to another array variabel

        strings = new String[4];
        strings[1] = "mvn";
        System.out.println(strings[0]);

        int[] integers = new int[10];
        // default value of int is 0

        // default value of double is 0.0
        // default value of boolean is false
        char[] chars = new char[2];
        System.out.println(chars[1]);
        // default value of char is '/u0000'

        char c3 = 'a'; // 97
        if (c3 == 97) { // true , 'a' convert to int (ASCII code)
            System.out.println("c3 is 97 in ASCII");
        }
        if (c3 > 97) {
            System.out.println("c3 is 97 in ASCII");
        }

        long l = 2200000000L;
        // int x2 = l;
        int x2 = (int) l; // 強行 long轉int, you pick the risk.
        System.out.println("x2=" + x2); // -2094967296

        short s2 = 128;
        byte b = (byte) s2;
        System.out.println("b=" + b); // -128 , overflow, the 128 point to -128 after over 127 in byte

        // The ways to declare and assign String value]
        String s3 = "abc"; // "abc" is a string object in heap ("abc" 1)
        String s4 = new String("abc"); // this ;abc is another new string object in heap ("abc" 2)
        String s5 = "abc"; // this abc is same as teh s3 "abc" ("abc" 1 )
        String s6 = new String("abc"); // new "abc" object ("abc" 3)

        //
        String[] strings2 = new String[3];
        strings2[0] = "hello";
        strings2[1] = "hello";
        strings2[2] = "hello";

        String[] strings3 = new String[] {"hello", "hello", "hello"}; // imply the length = 3
        // array第一次declare 就決定 array length

        // --not suggest-- strings4 //
        String[] strings4 = {"hello", "hello", "hello"}; // imply yoi have to assign an string array object
        // default your input is string, because java detect you imply string in variable

        for (int i = 0; i < strings2.length; i++) { // array method has not ()
            System.out.println(strings2[i]);
        }

        // Example 1
        int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
        // loop: print odd numbers
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 1) {
                System.out.println(integers2[i]);
            }
        }
        // average value of even numbers
        int countEven = 0;
        int totalEven = 0;
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 0) {
                countEven++;
                totalEven += integers2[i];
                // System.out.println(integers2[i]);
            }
        }
        double avgEven = totalEven / countEven;
        System.out.println("The average of even number is " + avgEven);

        // find max
        int max = Integer.MIN_VALUE; // the min.value of int
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] > max) {
                max = integers2[i];
            }
        }
        System.out.println(max);
        // find min
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] < min) {
                min = integers2[i];
            }
        }
        System.out.println(min);

        // Searching
        char[] characters = new char[] {'a', 'b', 'e', 'k', 'f', 'o'};
        // check if the array contains char '!' -> true/false
        boolean result = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                result = true;
                break;
            }
        }
        System.out.println(result);

        // print out index of '!', if not found, print -1.
        int indexT = -1;
        int count = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                indexT = i;
                break;

            }
        }
        System.out.println(-1);


        // store all index of '!' in an other array
        char[] characters2 = new char[] {'a', 'b', '!', 'e', '!'};
        int[] indexes = new int[characters2.length];
        int countI = 0;
        for (int i = 0; i < characters2.length; i++) {
            if (characters2[i] == '!') {
                indexes[countI++] = i;
            }
        }

        System.out.println(Arrays.toString(indexes)); // [2,4,0,0,0]

        //
        String[] balls = new String[] {"RED", "YELLOW", "BLACK", "YELLOW"};
        double[] prices = new double[] {5.5, 7.8, 10.0, 7.8};
        int[] quantities = new int[] {1, 3, 4, 5};
        // Yellow balls (price * quantity)
        double totalPrice = 0;
        for (int i = 0; i < balls.length; i++) {
            if ("YELLOW".equals(balls[i])) {
                totalPrice += (prices[i] * quantities[i]); // double*int ->double
            }
        }
        System.out.println(totalPrice); // 62.4

        // Swapping
        int[] arr2 = new int[] {10, 3, 9, 4}; // 9,3,10,4
        int temp = arr2[0];
        arr2[0] = arr2[2];
        arr2[2] = temp;
        System.out.println(Arrays.toString(arr2));

        // [9, 3, 10 ,4]
        // Target: [3, 10, 4, 9]

        // int swapTime = 1;
        // for (int j = 0; j < swapTime; j++) {
        // temp = arr2[0];
        // for (int i = 0; i < arr2.length - 1; i++) {
        // arr2[i] = arr2[i + 1];
        // }
        // arr2[(arr2.length - 1)] = temp;
        // }
        // System.out.println(Arrays.toString(arr2));

        // Model Answer
        for (int i = 0; i < arr2.length - 1; i++) {
            temp = arr2[i];
            arr2[i] = arr2[i + 1];
            arr2[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr2));

        // Now: [3, 10, 4, 9]
        // Target" [10, 3, 4, 9]
        // Move the max value to the head of the array
        int[] arr3 = new int[] {5, 6, 7, 8, 9, 10, 4, 5, 3};
        max = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
                indexMax = i;
            }
        }
        // temp = arr2[0];
        // arr2[0] = arr2[indexMax];
        // arr2[indexMax] = temp;

        for (int i = indexMax; i > 0; i--) {
            temp = arr3[i];
            arr3[i] = arr3[i - 1];
            arr3[i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr3));

        // Sorting
        // bubble sort, every loop the last one is sorted
        int[] arr4 = new int[] {99, -10, -42, 8, 19, 1, -50};
        // Target: {-42, -10, 1, 8, 19}
        for (int j = 0; j < arr4.length - 1; j++) {
            for (int i = 0; i < arr4.length - 1 - j; i++) {
                if (arr4[i] > arr4[i + 1]) {
                    temp = arr4[i];
                    arr4[i] = arr4[i + 1];
                    arr4[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = new int[] {-10, -5, -30, 0, 1, -100};
        for (int i = 1; i < arr5.length; i++) { //1,2
            int key = arr5[i]; //fixed by i // -30
            int k;
            for (k = i - 1; k >= 0; k--) {  //0 //1,0// 2,1,0//3,2,1,0
                if (arr5[k] <= key) {
                    break;
                } else { 
                    arr5[k + 1] = arr5[k];
                    arr5[k] = key;
                }  
                
            }
            arr5[k + 1] = key; // 
        }
        System.out.println(Arrays.toString(arr5));

        // arr5 = new int[] {-10, -5, -30, 0, 1, -100};
        // for (int i = 1; i < arr5.length; i++) {
        //     if (arr5[i] < arr5[i - 1]) {
        //         for (int j = i; j > 0; j--) {
        //             if (arr5[j] < arr5[j - 1]) {
        //                 temp = arr5[j];
        //                 arr5[j] = arr5[j - 1];
        //                 arr5[j - 1] = temp;
        //             }
        //         }
        //     }
        //     System.out.println(Arrays.toString(arr5));
        // }
        // System.out.println(Arrays.toString(arr5));

        //Sorting - Selection Sort


    }
}
