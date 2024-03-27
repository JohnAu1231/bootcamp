import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class App {
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

        //Example 3
        int score = 90;
        char grade = ' ';
        //score > 90 = A
        //80 - 90 = B
        //70 - 79 = C
        // < 70 = F
        //Print out: "The grade is B and passed."
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
        } else if (score >= 80) { //not need <=90 because it already compare the score>90 before
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C')
            pass = "passed";
        System.out.println("The grade is " + grade + " and " + pass);
    }
}
