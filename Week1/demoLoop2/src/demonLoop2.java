import java.util.Arrays;

public class demonLoop2 {
    public static void main(String[] args) {

        // 1. initial value
        // 2. continue condition
        // 3. incremental / decremental


        int[] arr = new int[] {2, 10, 3, -1};
        for (int i = 0; i < arr.length; i++); // i = index not value
        // for-each
        // if you want to loop through all element from the beignning, you can use for-each
        for (int i : arr) { // i = value
            System.out.println(i);
        }
        String[] strings = new String[] {"abc", "def"};
        for (String str : strings) {
            System.out.println(str); // print value
        }

        // while loop
        // while(continue condition){}
        // alwyas using in complex condtion , such as continue condition need to be changed in some condition
        int count = 0;
        while (count < strings.length) {
            System.out.println(strings[count++]);
        }
        /*
         * Step 1: count = 0 < 2 = true Step 2: print, count+1=1 Step 3: count = 1 < 2 = true Step 4: print, count+1=2 Step 5: count =2 < 2 = false Step 6: End
         */

        // byte b = 0;
        // while (b < 128) { // infinity loop
        //     b++; // -128
        // }
        /*
         * Step 1: check if b < 128, b = 0 <128 ,true Step 2: b ++ ,b = 1 ...... Step x: b = 127 < 128 , true Step x+1: b++,byte has not 128, b = -128 step x+2: b = -128 < 128, true infinity loop
         */


        // Target: int array [1, 0, 2, 3]
        // int c = 1023 % 10; //3
        // int d = (a / 10) % 10; //2  102 % 10 = 2
        // int e = ((a/10) /10) %10; //0 10 % 10 = 0

        //**********************************************
        int a = 710235;
        int copy = a;
        count = 0;
        while (copy > 0) {
            copy /=10;
            count++;
        }
        int[] result = new int[count];
        copy = a;
        while (copy > 0) {
            result[count-1] = copy % 10;
            copy /=10;
            count--;
        }
        System.out.println(Arrays.toString(result));
        //**********************************************

        //do-while  , 強調DO 個PART 一定要做一次
        count = 0;
        do {
            System.out.println("Hello");
            count++;
        } while (count < 3);


    }
}
