import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class DemoIf {
    public static void main(String[] args) throws Exception {
        int x = 4;
        if (x > 3) {
            int y = 10;
            System.out.println("Hello, World! " + y);
        } else {
            System.out.println("John Au");
            // System.out.println("John Au"+ y); //y does not declare in this block
        }
        // "if method" start from top to the end
        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) { // && means "and"
            System.out.println("x >= 0 and x <= 2");
        } else {
            System.out.println("x < 0");
        }

        // If Example 1
        int a = 3;
        int b = 10;
        int max = 0;
        if (b > a) {
            max = b;
        } else {
            max = a;
        }
        System.out.println("The max number is " + max + ".");
        // Print out: the max number is 10

        // If example 1 smart coding
        int c = 12;
        int d = 10;
        int max2 = c; // declare the variable first
        if (d > c) {
            max2 = d;
        }
        System.out.println("The max number is " + max2 + ".");

        // Example 2
        String day = "Monday"; // Monday, Tuseday...
        String daytype = "weekday";
        if (day.equals("Sunday")) {
            daytype = "weekend";
        } else if (day.equals("Saturday")) {
            daytype = "weekend";
        }
        System.out.println(day + " is a " + daytype + ".");
        // Example 2 using ||(or)
        if (day.equals("Sunday") || day.equals("Saturday")) {
            daytype = "weekend";
        }
        System.out.println(day + " is a " + daytype + ".");
        // Example 2 Good Formal
        if ("Sunday".equals(day) || "Saturday".equals(day)) {
            daytype = "weekend";
        }
        System.out.println(day + " is a " + daytype + ".");

        // Print out: It is a weekday.

        // Compare Strings
        // 1. String value compares wtih String variable
        // Format: "StringValue".equals(StringVariable)
        // example: "Monday".equals(daytype)
        // 2. String variable compares wtih String variable

        // Example 3
        int score = 90;
        char grade = ' ';
        // score > 90 = A
        // 80 - 90 = B
        // 70 - 79 = C
        // < 70 = F
        // Print out: "The grade is B and passed."
        grade = 'F';
        String pass = "failed";
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C')
            pass = "passed";
        System.out.println("The grade is " + grade + " and " + pass);

        // example 3 writing faster
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) { // not need <=90 because it already compare the score>90 before
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C')
            pass = "passed";
        System.out.println("The grade is " + grade + " and " + pass);

        // Sting with if
        String s1 = "hello";
        // check if the length of s1 > 5
        if (s1.length() > 5) {
            System.out.println("The length of s1 > 5");
        } else {
            System.out.println("The length of s1 <= 5");
        }

        // Another approach:
        if (!(s1.length() <= 5)) {
            System.out.println("The length of s1 >5");
        }

        // char (==, >=, <=, >, <, !=)
        char gender = 'F';
        if (gender == 'M') {
            System.out.println("Gender is " + gender);
        } else if(gender == 'F') {
            System.out.println("Gender is not M");
        }

        if (gender != 'M') {
            System.out.println("Gender is not M");
        }

        // int, long, short, byte, float, double (==, >=, <=, >, <, !=)
        double u = 10.4;
        if (u >10) {//10 -> double: 10.4 -> 10.0
            System.out.println("u > 10");
        }
        // boolean (==, !=)
        int v = 4;
        boolean b1 = v >10; //false
        boolean c1 = v < 20;
        if (b1 == true) {

        } 
        if (b1 == false){

        }
        if (!(b1 == true && c1 == true)) { 
            //That means if clause ture when all other scenario 
            //1. b1 == true && c1 == false
            //2. b1 == false && c1 == true
            //3. b1 == false && c1 == false

        }

        // String.charAt(int index) -> return char
        String s2 = "abcdefg";
        // Check if s2 start with 'a' and end with 'g', print out "yes", otherwise "no"
        int s2EndIndex = s2.length() - 1; // length -1 = end char index
        System.out.println(s2EndIndex); // check length index
        System.out.println(s2.charAt(0)); //a
        System.out.println(s2.charAt(s2.length() - 1)); //g or end char

        if (s2.charAt(0) == 'a' && s2.charAt(s2.length() - 1) == 'g') {
            System.out.println("Yes");
        } else { 
            System.out.println("No");
        }

        System.out.println(true && false); //false
        System.out.println(false && true);//false (the true is dead code, because the first condtion always true)
        System.out.println(true && true);//true
        System.out.println(false && false);//false

        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || false); //false
        System.out.println(false || true); //true
        
        


    }
}
