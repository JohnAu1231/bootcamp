public class JavaFormat {
    public static void main(String[] args) {
        // 9 types = Primitives + String
        int x = 2;
        String s = "abc";

        // Array 陣列 (store a set of same type of values)
        int[] arr = new int[3]; // this array only can store 3 values
        // Assign value to the int array
        arr[0] = 100;
        arr[1] = 30;
        arr[2] = 6;
        System.out.println(arr[0]); //100
        System.out.println(arr[1]); //30
        System.out.println(arr[2]); //6
        // create another int array to the original variable
        arr = new int[4]; // now arr assign to arr[4],not the arr[3] before
        //but arr[3] still in memory, but arr not assign to arr[3] anymore
        System.out.println(arr[0]); //0 
        System.out.println(arr[1]); //0
        System.out.println(arr[2]); //0
        System.out.println(arr[3]); //0

        long[] arr2 = new long[10];
        arr2[0] = 13579;
        arr2[1] = 24680;
        arr2[2] = 1000;
        arr2[3] = 2000;
        arr2[4] = 3000;
        long result = arr2[1] - arr2[0];
        System.out.println(result);
        String[] strings = new String[2];
        strings[0] = "first";
        strings[1] = "second";
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        String str2 = "";
        str2 += strings[0].charAt(1);
        System.out.println(strings[0].charAt(1));





    }
}
